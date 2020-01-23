package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public interface Computer {

    List<Program> programs = new ArrayList<>();

    void bootUp();

    void addProgram(Program program);

    void removeProgram(Program program);
}