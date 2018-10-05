package dao;

import models.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface ProductDaoInterface {
    ArrayList<Product> searchProductByName(String foodname, String tableName) throws SQLException;
    ArrayList<Product> getAllProduct(String tableName) throws SQLException;
}
