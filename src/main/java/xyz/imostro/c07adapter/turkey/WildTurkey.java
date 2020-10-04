package xyz.imostro.c07adapter.turkey;

/**
 * @author Gray
 * @date 2020/10/2 13:16
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I`m flying a short distance");
    }
}
