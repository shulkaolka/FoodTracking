package dao;

import models.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements ProductDaoInterface {
    public ArrayList<Product> searchProductByName(String foodname, String tableName) throws SQLException {
        ArrayList<Product> products = new ArrayList<Product>();
        Connection connection = DBUtil.getDataSource().getConnection();
        Statement stmt = connection.createStatement();
        String sql = "select * from " + tableName + " where foodname LIKE '%" + foodname + "%'";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Product product = new Product(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getInt(4),
                    rs.getInt(5),
                    rs.getInt(6)
            );
            products.add(product);
        }
        rs.close();
        connection.close();
        return products;
    }

    public ArrayList<Product> getAllProduct(String tableName) throws SQLException {
        ArrayList<Product> products = new ArrayList<Product>();
        Connection connection = DBUtil.getDataSource().getConnection();
        Statement stmt = connection.createStatement();
        String sql = "select * from " + tableName;
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Product product = new Product(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getInt(4),
                    rs.getInt(5),
                    rs.getInt(6)
            );
            products.add(product);
        }
        rs.close();
        connection.close();
        return products;
    }
}
