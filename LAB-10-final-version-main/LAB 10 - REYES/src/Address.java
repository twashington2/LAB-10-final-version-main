/* Lab 10,
Niko Reyes
IST 240 Mark Choman
 */
public class Address {

    private int number, pobox;
    private String name, type, state;
    private ZipCode zip;

    public Address() {
        setNumber(0);
        setName("N/a");
        setType("Unknown");
        setZip(new ZipCode());
        setState("  ");
        setPobox(0);
    }

    public Address(ZipCode zip, int pobox) {
        setNumber(0);
        setName("N/a");
        setType("Unknown");
        setZip(zip);
        setState("  ");
        setPobox(pobox);
    }

    public Address(int number, String name, String type, ZipCode zip,
            String state, int pobox) {
        setNumber(number);
        setName(name);
        setType(type);
        setZip(zip);
        setState(state);
        setPobox(pobox);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPobox() {
        return pobox;
    }

    public void setPobox(int pobox) {

        this.pobox = pobox;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        String formatCase = "";

        name = name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase();

        for (int i = 0; i < name.length();) {
            char ch = name.charAt(i);

            if (ch == ' ') {
                formatCase = formatCase + ' '
                        + Character.toUpperCase(name.charAt(i + 1));
                i = i + 2;

            } else {
                formatCase = formatCase + ch;
                i++;
            }

        }

        this.name = formatCase;

    }

    public String getType() {

        if (null == type) {
            return type;
        } else {
            switch (type) {
                case "Drive":
                    return "Dr.";
                case "Avenue":
                    return "Ave.";
                case "Street":
                    return "St.";
                default:
                    return type;
            }
        }

    }

    public void setType(String type) {

        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ZipCode getZip() {
        return zip;
    }

    public void setZip(ZipCode zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {

        return "Address{" + "number=" + getNumber() + ", name=" + getName()
                + ", type=" + getType() + ", zip=" + getZip().toString()
                + ", state=" + getState() + ", pobox=" + getPobox() + '}';
    }
}
