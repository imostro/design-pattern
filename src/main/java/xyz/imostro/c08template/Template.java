package xyz.imostro.c08template;

/**
 * 模板方法模式 在一个方法中定义了一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
 *
 * 模板方法定义了一个算法的步骤，并允许子类为一个或多个步骤提供实现
 *
 * 例如 Coffee 和 Tea类，它们之中1，3步骤存在着重复的代码，2，4则是不同的，而这些重复的代码都是可以提取为公共部分的，而不同部分则可以使用抽象
 * 方法代替，由它具体实现去实现该接口。
 *
 */
public class Template {

}