package AdapterPattern;

/**
 * @author lilei
 * 被适配的对象
 **/
public class StudentWrapper {
    private String name;
    private int age;
    private String address;
    private String idCard;

    public StudentWrapper(String name, int age, String address, String idCard) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.idCard = idCard;
    }
}
