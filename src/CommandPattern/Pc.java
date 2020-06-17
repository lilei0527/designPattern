package CommandPattern;

/**
 * @author lilei
 **/
public class Pc implements Computer {
    @Override
    public void bootUp() {
        System.out.println("pc boot up start");
        for (Program program : programs) {
            if (program instanceof BootUpProgram) {
                program.execute();
            }
        }
        System.out.println("pc boot up end");
    }

    @Override
    public void addProgram(Program program) {
        programs.add(program);
    }

    @Override
    public void removeProgram(Program program) {
        programs.remove(program);
    }
}
