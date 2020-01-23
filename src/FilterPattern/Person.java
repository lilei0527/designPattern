package FilterPattern;

@SuppressWarnings("unused")
public class Person {
    Person(String sex, int age, String name) {
        this.sex = sex;
        this.age = age;
        this.name = name;
    }

    private String sex;
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
