package xyz.imostro.c05singleton;


import com.sun.org.apache.regexp.internal.RE;
import org.omg.CORBA.UNKNOWN;

/**
 * 单例模式：确保一个类只有一个实例，并提供一个全局访问点
 *      有些资源并不是需要重复创建的，环境中只需持有一个即可，例如打印机、数据库连接池这类资源，如果重复持有则会出现问题。
 *
 */
public class Singleton {

    /**
     * 多线程条件下，加入volatile，使变量在多线程条件下改变可见，防止指令重排
     */
    private volatile static Singleton uniqueSingleton;

    private Singleton() {
    }

    public static Singleton getInstance(){

        // 这种初始化在单线程下没有问题，但是一旦在多线程下执行，就会出现重复创建的可能
        // 还有可能返回的对象不是同一个
        if (uniqueSingleton == null){
            // 进来的线程A休眠
            // 进来的线程B创建并返回
            // 线程A开始工作
            // 线程A返回创建对象
            uniqueSingleton = new Singleton();
        }

        return uniqueSingleton;
    }

    /*
        直接使用synchronized可以保证只有一个线程完成创建工作，但是同时也会出现一个问题：性能问题，
        因为已经完成创建之后，就没必要保证线程同步了，如果还是用synchronized的话会在get的时候出现性能问题
     */
    public static synchronized  Singleton syncGetInstance(){
        if (uniqueSingleton == null){
            uniqueSingleton = new Singleton();
        }

        return uniqueSingleton;
    }

    /*
        双重检查加锁
     */
    public static Singleton getInstanceDDL(){
        if (uniqueSingleton == null){
            synchronized (Singleton.class){
                if (uniqueSingleton == null){
                    uniqueSingleton = new Singleton();
                }
            }
        }

        return uniqueSingleton;
    }
}
