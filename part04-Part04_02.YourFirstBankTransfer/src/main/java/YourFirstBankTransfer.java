
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mat = new Account("Matthews account", 1000.00);
        Account me = new Account("My account", 0.00);
        mat.withdrawal(100);
        me.deposit(100);
        System.out.println(mat);
        System.out.println(me);
    }
}
