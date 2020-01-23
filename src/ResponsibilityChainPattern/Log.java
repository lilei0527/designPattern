package ResponsibilityChainPattern;

/**
 * @author lilei
 **/
public class Log {
    private int leave;
    private String content;

    public int getLeave() {
        return leave;
    }

    public void setLeave(int leave) {
        this.leave = leave;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Log(int leave, String content) {
        this.leave = leave;
        this.content = content;
    }

    void printLog() {
        System.out.println("leave:"+leave+"  "+content);
    }
}
