package academy.belhard;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        if (firstName == null || lastName == null || address == null){
            NullFieldException exception = new NullFieldException("попытка передать значение null в одно из полей объекта типа Person");
            throw exception;
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        if (firstName == null){
            NullFieldException exception = new NullFieldException("попытка передать значение null в firstName");
            throw exception;
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null){
            NullFieldException exception = new NullFieldException("попытка передать значение null в lastName");
            throw exception;
        }
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        if (address == null){
            NullFieldException exception = new NullFieldException("попытка передать значение null в address");
            throw exception;
        }
        this.address = address;
    }

    @Override
    public String toString() {
        return "person: " + "firstName= " + firstName +
                ", lastName= " + lastName +
                "  address: " + address;
    }



}
