package Service;
import Exceptions.CountElementException;
import Exceptions.DateFormatException;
import Exceptions.EmptyStringException;
import Human.Person;
import Service.Verification.*;
import View.Controller;

import java.io.IOException;


public class DataGet {
    Controller controller = new Controller();
    public void getData(String text) throws EmptyStringException, CountElementException, DateFormatException, IOException {
        System.out.printf(text+"\n");
        if (text.isEmpty()) {
            throw new EmptyStringException("Your input empty string");
        }
        text = text.replaceAll("\\s+", " ");
        text = text.trim();
        String[] stringArray = text.split(" ");
            CheckCountElements.checkCountElements(stringArray);
            CheckFullNameFormat.checkFullNameFormat(stringArray[0]);
            CheckFullNameFormat.checkFullNameFormat(stringArray[1]);
            CheckFullNameFormat.checkFullNameFormat(stringArray[2]);
            CheckDateFormat.checkDateFormat(stringArray[3]);
            CheckPhoneNumberFormat.checkPhoneNumberFormat(stringArray[4]);
            CheckGenderFormat.checkGenderFormat(stringArray[5]);
            Person person = new Person(stringArray[0],stringArray[1],stringArray[2],stringArray[3], stringArray[4], stringArray[5]);
            SaveToFile.savePersonToFile(person);
        }
    }
