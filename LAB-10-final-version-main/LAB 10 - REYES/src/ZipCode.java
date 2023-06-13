/*  Lab 10,
Niko Reyes
IST 240 Mark Choman
 */
public final class ZipCode {

    private String fiveDigit, plus4;

    public ZipCode() {
        setFiveDigit("00000");
        setPlus4("");
    }

    public ZipCode(String fiveDigit) {
        setFiveDigit(fiveDigit);
        setPlus4("");
    }

    public ZipCode(String fiveDigit, String plus4) {
        setFiveDigit(fiveDigit);
        setPlus4(plus4);
    }

    public String getFiveDigit() {
        return fiveDigit;
    }

    public void setFiveDigit(String fiveDigit) {
        this.fiveDigit = fiveDigit;
    }

    public String getPlus4() {
        return plus4;
    }

    public void setPlus4(String plus4) {
        this.plus4 = plus4;
    }

    @Override
    public String toString() {
        if (getPlus4().equals("") || (getPlus4().isEmpty() || (getFiveDigit().equals("00000")
                || (getFiveDigit().isEmpty())))) {
            return getFiveDigit();
        } else {
            return getFiveDigit() + "-" + getPlus4();

        }

    }

    public void display() {
        System.out.println(toString());

    }

    public void display(int p) {
        if (p == 1) {
            System.out.println("Prefix = " + getFiveDigit().substring(0, 3));

        } else if (p == 2) {
            System.out.println("Area = " + getFiveDigit().substring(3, 5));
        }

    }

}
