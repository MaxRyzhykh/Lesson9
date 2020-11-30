package academy.belhard;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws EmptySourceFileException {


        Address address1 = new Address("Minsk","Rokossovskogo",236);
        Person person1 = new Person("Maxim","Ryzhykh", address1);

        Address address2 = new Address("Minsk","Narodnaya",17);
        Person person2 = new Person("Nastya","Gladkaya", address2);

        Address address3 = new Address("Gomel","Brezhneva",21);
        Person person3 = new Person("Iosif","Cuper", address3);

        System.out.println(person1 + "\n" + person2 + "\n" + person3 + "\n");


        ArrayList<Person> personsList = new ArrayList<>();
        personsList.add(person1);
        personsList.add(person2);
        personsList.add(person3);

        PersonIOUtil.writePersons("person.txt", personsList);

        PersonIOUtil.readPersons("person.txt");
    }
}
