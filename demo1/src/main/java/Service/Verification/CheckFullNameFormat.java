package Service.Verification;

import Exceptions.IncorrectValueException;

public class CheckFullNameFormat {
    public static void checkFullNameFormat(String name){
        if (!name.matches("[A-Za-zА-Яа-я]+")){
            throw new IncorrectValueException("You entered an incorrect last name, first name or patronymic");
        }
    }

}
