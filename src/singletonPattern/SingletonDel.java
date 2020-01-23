package singletonPattern;
/*
* 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
* */

@SuppressWarnings("unused")
public class SingletonDel {
    private SingletonDel(){}
    //加volatile关键字防止指令重排序
    private static volatile SingletonDel instance;
    public static SingletonDel getInstance(){
        if(instance==null){
            synchronized (SingletonDel.class){
                if(instance==null){
                    instance=new SingletonDel();
                }
            }
        }
        return instance;
    }
}
