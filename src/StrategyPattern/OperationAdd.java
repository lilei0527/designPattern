package StrategyPattern;

/**
 * @author lilei
 **/
public class OperationAdd implements Strategy {


    @Override
    public int doOperation(int t1, int t2) {
        return t1+t2;
    }
}
