package academy.belhard;

import java.io.*;
import java.util.ArrayList;

public class PersonIOUtil {

    public static void writePersons(String fileName, ArrayList<Person> list) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Person person : list) {
                String s = PersonIOUtil.formatPersonForWriting(person);
                writer.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String formatAddressForWriting(Address address) {
        return address.getCity() + ";" + address.getStreet() + ";" + address.getHouseNumb();
    }

    public static String formatPersonForWriting(Person person) {
        return person.getFirstName() + ";" + person.getLastName() + ";"
                + formatAddressForWriting(person.getAddress()) + "\n";
    }


    public static void readPersons(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String s;
            ArrayList<Person> newPersonList = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                Person person = PersonIOUtil.formatObject(s);

                newPersonList.add(person);
            }

            for (Person person : newPersonList) {
                System.out.println(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person formatObject (String s){
        String[] fields = s.split(";");

        String firstName = fields[0];
        String lastName = fields[1];
        String city = fields[2];
        String street = fields[3];
        int houseNumb = Integer.parseInt(fields[4]);

        Address a = new Address(city, street, houseNumb);
        return new Person(firstName, lastName, a);
    }

}
