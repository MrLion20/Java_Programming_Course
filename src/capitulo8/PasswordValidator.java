package capitulo8;

import java.util.Scanner;

public class PasswordValidator {
    //User Data
    private String username;
    private String currentPassword;
    //important info
    private String errorMessage;
    private boolean valid;

    private static Scanner scanner = new Scanner(System.in);

public PasswordValidator (String username, String currentPassword){
    this.username = username;
    this.currentPassword = currentPassword;
}
public boolean isValid(){
    return valid;
}
public String getErrorMessage() {
    return errorMessage;
}
public void closeScanner(){
    scanner.close();
}

//FUNC main
public static void main(String[] args){

    var validator = login();
    validator.printPasswordRules();

    do {
        var proposedPassword = validator.getProposedPassword();
        validator.changePassword(proposedPassword);

        if (!validator.isValid()) {
            System.out.println(validator.getErrorMessage());

        }
    }
        while (!validator.isValid()) ;

        System.out.println("The proposed password is valid");

        validator.closeScanner();
    }

public static PasswordValidator login(){
    System.out.println("enter yout username");
    String username = scanner.nextLine();

    System.out.println("enter yout password");
    String password = scanner.nextLine();

    return new PasswordValidator(username, password);

}

    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public String getProposedPassword(){
        System.out.println("Enter your new password");
        return scanner.nextLine();
    }

    public void changePassword(String newPassword){
        valid = true;
        errorMessage = " ";

        //Rule #1 : at Least 8 characters long
        if (newPassword.length()<8){
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters.";
        }
        //Rule #2 : Contain an uppercase letter
        if (newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must include an uppercase letter.";
        }
        //Rule #3 : Contain a special Character
        if (newPassword.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            errorMessage += "\n Your password must include a special character (e.g. %,$[:).";
        }

        //Rule #4 : Not contain the username
        if (newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password cannot contain your username.";
        }
        //Rule # : Not the same as the old Password
        if (newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your password must be different from your current password.";
        }
    }

}
