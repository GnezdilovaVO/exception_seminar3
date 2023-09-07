package Homework.Task1;

public class PasswordVerifier {
    public boolean checkLength(String password) throws PasswordLengthException {
        if (password.length() < 8) {
            throw new PasswordLengthException("Length less than 8.");
        }
        return true;
    }
    public boolean checkCapsLook (String password) throws PasswordCapsLookException {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        throw new PasswordCapsLookException("It hasn't Capital letter.");
    }

    public boolean checkIsDigrit(String password) throws PasswordIsDigritException {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        throw new PasswordIsDigritException("It hasn't digrit.");
    }
    public boolean checkAll (String password) throws PasswordCapsLookException, PasswordIsDigritException, PasswordLengthException {
        return checkCapsLook(password) && checkIsDigrit(password) && checkLength(password);
    }

}
