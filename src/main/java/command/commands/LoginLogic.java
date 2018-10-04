package command.commands;

import util.DBUtil;

import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginLogic {
    public static String checkLogin(String enterLogin, String enterPass) throws SQLException, NamingException {
        Connection connection = DBUtil.getDataSource().getConnection();
        Statement stmt = connection.createStatement();
        String sql = "select password, role from users where username = '" + enterLogin + "'";
        String truePass = null;
        String role = "";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            truePass = rs.getString(1);
            role = rs.getString(2);
        }
        if (enterPass.equals(truePass)){
            return role;
        }else {
            return "";
        }
    }
}
