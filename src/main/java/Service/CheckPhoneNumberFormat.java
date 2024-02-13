package Service;

import Exceptions.IncorrectValueException;

public class CheckPhoneNumberFormat {
    public  static void checkPhoneNumberFormat(String phoneNumber) throws IncorrectValueException {
        try {
                long check = Long.parseLong(phoneNumber); // ошибка приведения вида
            } catch (IncorrectValueException e){
                throw new IncorrectValueException("The format phone number entered is incorrect. The correct phone number entry format is: 37512345678");
            }
        }

    }
