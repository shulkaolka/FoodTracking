package command.commands;

public class LoginLogic {
    public static boolean checkLogin(String enterLogin, String enterPass) {
        String truePass = "";
        truePass = "123";
        return enterPass.equals(truePass);
    }
}
