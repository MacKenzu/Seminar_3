package Service.Verification;

import Exceptions.IncorrectValueException;

public class CheckDateFormat {
    public static void checkDateFormat(String date) throws IncorrectValueException {
        if (!date.matches("([0-2][0-9]|3[0-1])\\.(0[1-9]|1[0-2])\\.(\\d{4})")) {
            throw new IncorrectValueException("The date format entered is incorrect. The correct data entry format is: dd.mm.yyyy.");
        }
    }
}

