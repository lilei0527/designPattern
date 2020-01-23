package MementoPattern;

public class MementoPatternDemo {
    public static void main(String[] args) {
        VisitorMemento visitorMemento = new VisitorMemento();
        Interviewer interviewer = new Interviewer();

        visitorMemento.addVisitor(interviewer.intervie("tom","1562325658"));
        visitorMemento.addVisitor(interviewer.intervie("mary","1456985623"));

        interviewer.intervie(visitorMemento.getVisitor(0));
    }

}
