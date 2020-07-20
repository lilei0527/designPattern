package AdapterPattern;

/**
 * @author lilei
 * 假设student这个类不能被改变，生成一个student
 **/
public class Wrapper {
    public StudentWrapper getStudentWrapper(Student student, String address, String idCard) {
        return new StudentWrapper(student.getName(), student.getAge(), address, idCard);
    }
}
