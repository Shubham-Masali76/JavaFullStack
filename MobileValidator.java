// Create local class to validate mobile number i.e. 10 digits and not start with ‘0’.

public class MobileValidator {

    public void validateMobile(String mobile) {
        class Validator {
            public boolean isValid() {
                return mobile.matches("^[1-9][0-9]{9}$");
            }
        }

        Validator validator = new Validator();
        System.out.println("Mobile valid: " + validator.isValid());
    }

    public static void main(String[] args) {
        new MobileValidator().validateMobile("9876543210");  // true
    }
}
