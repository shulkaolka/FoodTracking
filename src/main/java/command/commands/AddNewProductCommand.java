package command.commands;

import managers.ConfigurationManager;
import managers.MessageManager;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class AddNewProductCommand implements ActionCommand {
    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";

    public String execute(HttpServletRequest request) throws SQLException, NamingException {
        String page;
        String login = request.getParameter(PARAM_NAME_LOGIN);
        String pass = request.getParameter(PARAM_NAME_PASSWORD);
        String role = LoginLogic.checkLogin(login, pass);
        if (!(role.equals(""))) {
            request.setAttribute("user", login);
            if ("admin".equals(role))
                page = ConfigurationManager.getProperty("path.page.admin");
            else
                page = ConfigurationManager.getProperty("path.page.main");
        } else {
            request.setAttribute("errorLoginPassMessage", MessageManager.getProperty("message.loginerror"));
            page = ConfigurationManager.getProperty("path.page.login");
        }
        return page;
    }
}

