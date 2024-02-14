package Service.Verification;

import Exceptions.IncorrectValueException;

public class CheckGenderFormat {
    public static void checkGenderFormat(String gender) throws IncorrectValueException {
        gender = gender.toLowerCase();
        if (gender.length() != 1) {
            throw new IncorrectValueException("You didn't enter gender. Please enter gender");
        } else if (!gender.equals("м") && !gender.equals("ж")) {
            throw new IncorrectValueException("The gender format entered is incorrect. The correct gender entry format is: м or ж");
        }
    }
}
