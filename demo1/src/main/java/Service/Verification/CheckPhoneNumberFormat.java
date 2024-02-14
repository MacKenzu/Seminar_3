package Service.Verification;

import Exceptions.IncorrectValueException;

public class CheckPhoneNumberFormat {
    public  static void checkPhoneNumberFormat(String phoneNumber) throws IncorrectValueException {
        if (!phoneNumber.matches("[0-9]+")){
                throw new IncorrectValueException("The format phone number entered is incorrect. The correct phone number entry format is: 37512345678");
            }
        }

    }
