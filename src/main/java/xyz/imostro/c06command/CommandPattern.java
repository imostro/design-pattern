package xyz.imostro.c06command;

/**
 * 命令模式 将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
 *
 * 宏命令： 通过把一个个原子命令组装到一起，然后一次性执行。
 *
 *
 * 要点:
 *  - 命令模式将发出请求的对象和执行请求的对象解耦。
 *  - 在被解耦的两者之间是通过命令对象进行沟通的。
 *  - 调用者通过调用命令对象的execute()发出请求，这会使得接收者的动作被调用。
 *  - 调用者可以接受命令当做参数，甚至在运行时动态地进行。
 *  - 命令可以支持撤销，做法是实现一个undo()方法来回到execute()被执行前的状态。
 *  - 宏命令是一个命令的一种简单的延申，允许调用多个命令。宏方法也可以支持销。
 *  - 实际操作时，很常见使用“聪明”命令对象，也就是直接实现了请求，而不是将工作委托给接收者。
 *  - 命令也可以用来实现日志和事务系统。
 *
 * 框架中对命令模式的应用：参见线程池的设计
 */
public class CommandPattern {

}
