package Service;

import Human.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {
    public static void savePersonToFile(Person person) throws IOException {
        String filename = person.getLastName() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(person.toString());
            writer.newLine();
        }
    }
}
