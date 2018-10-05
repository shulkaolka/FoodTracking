package command.commands;

import managers.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

public class ListAllCommand implements ActionCommand {
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.allproducts");
        return page;
    }
}
