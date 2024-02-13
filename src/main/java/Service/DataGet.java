package Service;
import Exceptions.CountElementException;
import Exceptions.DateFormatException;
import Exceptions.EmptyStringException;
import com.example.demo.Controller;


public class DataGet {
    Controller controller = new Controller();
    public void getData(String text) throws EmptyStringException, CountElementException, DateFormatException
    {
        System.out.printf(text+"\n");
        if (text.isEmpty()) {
            throw new EmptyStringException("Your input empty string"); //создать свои Ексепшены
        }
        text = text.replaceAll("\\s+", " ");
        text = text.trim();
        String[] stringArray = text.split(" ");
        if (stringArray.length == 6) {
            CheckDateFormat.checkDateFormat(stringArray[3]);

        }
        else {
            throw new CountElementException("You have not entered all the data");
        }
    }
}
