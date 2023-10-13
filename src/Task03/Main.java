package Task03;

public class Main {
    public static void main(String[] args) {
        Money money = new Money(10L, (byte) 98);
        System.out.println(money);
        money.addSum(20L,(byte)12);
        System.out.println(money);
        money.minusSum(20L,(byte)12);
        System.out.println(money);
        money.delSum(20L,(byte)12);
        System.out.println(money);
        money.multy(2.756457);
        System.out.println(money);
        money.div(2.756457);
        System.out.println(money);
        money.compSum(1L,(byte)43);
    }
}