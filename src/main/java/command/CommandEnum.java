package command;

import command.commands.*;

public enum CommandEnum {
    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    },
    SEARCH {
        {
            this.command = new SearchCommand();
        }
    },
    ADD {
        {
            this.command = new AddToMeCommand();
        }
    },
    LISTALL {
        {
            this.command = new ListAllCommand();
        }
    };
    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}
