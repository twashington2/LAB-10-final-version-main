/* Lab 10,
Niko Reyes
IST 240 Mark Choman
 */
public class Person {

    private String name;
    private Address address;

    public Person() {
        setName("John Doe");
        setAddress(new Address());

    }

    public Person(String name, Address address) {
        setName(name);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + getName() + ", address="
                + getAddress().toString() + '}';
    }
}
