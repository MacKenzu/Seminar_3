package Service.Verification;

import Exceptions.CountElementException;

public class CheckCountElements {
    public static void checkCountElements (String [] array){
        if (array.length < 6) {
            throw new CountElementException ("You have not entered all the data");
        }
        if (array.length > 6) {
            throw new CountElementException("You have entered unnecessary data");
        }

    }

    public static class CheckFullNameFormat {
    }
}
