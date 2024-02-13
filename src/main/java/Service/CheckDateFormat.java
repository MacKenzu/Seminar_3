package Service;

import Exceptions.IncorrectValueException;

public class CheckDateFormat {
    public static void checkDateFormat(String date) throws IncorrectValueException {
        char[] checkData = date.toCharArray();
        if (checkData.length != 10 || (checkData[2] != '.' || checkData[5] != '.')) {
            throw new IncorrectValueException("The date format entered is incorrect. The correct data entry format is: dd.mm.yyyy.");
        }
    }
}

