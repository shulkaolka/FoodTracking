package command.commands;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public interface ActionCommand {
    String execute(HttpServletRequest request) throws ClassNotFoundException, SQLException, NamingException;
}
