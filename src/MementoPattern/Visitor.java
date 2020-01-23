package MementoPattern;

public class Visitor {
    private String name;
    private String phone;

    Visitor(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }



    public String getName() {
        return name;
    }

    String getPhone() {
        return phone;
    }
}
