package CommandPattern;

/**
 * @author lilei
 * 命令模式，在执行一个事件的时候可以动态的增加之前的实现步骤
 **/
public class CommandPatternDemo {
    public static void main(String[] args) {
        Computer pc = new Pc();
        Program userBootUpProgram = new UserBootUpProgram();
        Program bootUpProgram = new CoreBootUpProgram();
        Program graphBootUpProgram = new GraphBootUpProgram();
        pc.addProgram(bootUpProgram);
        pc.addProgram(graphBootUpProgram);
        pc.addProgram(userBootUpProgram);
        pc.bootUp();
    }
}
