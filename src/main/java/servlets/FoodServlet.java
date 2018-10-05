package servlets;

import command.ActionFactory;
import command.commands.ActionCommand;
import dao.ProductDao;
import managers.ConfigurationManager;
import managers.MessageManager;
import models.Product;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/FoodServlet")
public class FoodServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    private void processRequest(HttpServletRequest request,
                                HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException, NamingException {
        String page;

        ActionFactory client = new ActionFactory();
        ActionCommand command = client.defineCommand(request);
        page = command.execute(request);

        if (page != null) {
            if (page.equals(ConfigurationManager.getProperty("path.page.allproducts"))) {
                if (client.getCommandName(request).equals("search")) {
                    ArrayList<Product> products = new ProductDao()
                            .searchProductByName(request.getParameter("searchfield"), "foodcalorie");
                    request.setAttribute("productsFound", products);
                } else {
                    ArrayList<Product> products = new ProductDao()
                            .getAllProduct("foodcalorie");
                    request.setAttribute("productsFound", products);
                }
            }
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
            dispatcher.forward(request, response);
        } else {
            page = ConfigurationManager.getProperty("path.page.login");
            request.getSession().setAttribute("nullPage", MessageManager.getProperty("message.nullpage"));
            response.sendRedirect(request.getContextPath() + page);
        }
    }

//    public ArrayList<Product> getAllProduct(String tableName) throws SQLException {
//        ArrayList<Product> products = new ArrayList<Product>();
//        Connection connection = DBUtil.getDataSource().getConnection();
//        Statement stmt = connection.createStatement();
//        String sql = "select * from " + tableName;
//        ResultSet rs = stmt.executeQuery(sql);
//        while (rs.next()) {
//            Product product = new Product(
//                    rs.getInt(1),
//                    rs.getString(2),
//                    rs.getInt(3),
//                    rs.getInt(4),
//                    rs.getInt(5),
//                    rs.getInt(6)
//            );
//            products.add(product);
//        }
//        rs.close();
//        connection.close();
//        return products;
//    }
//
//    public ArrayList<Product> searchProductByName(String foodname, String tableName) throws SQLException {
//        ArrayList<Product> products = new ArrayList<Product>();
//        Connection connection = DBUtil.getDataSource().getConnection();
//        Statement stmt = connection.createStatement();
//        String sql = "select * from " + tableName + " where foodname LIKE '%" + foodname + "%'";
//        ResultSet rs = stmt.executeQuery(sql);
//        while (rs.next()) {
//            Product product = new Product(
//                    rs.getInt(1),
//                    rs.getString(2),
//                    rs.getInt(3),
//                    rs.getInt(4),
//                    rs.getInt(5),
//                    rs.getInt(6)
//            );
//            products.add(product);
//        }
//        rs.close();
//        connection.close();
//        return products;
//    }
}
