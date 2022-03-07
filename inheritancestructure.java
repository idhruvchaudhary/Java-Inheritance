import java.util.*;

class student {

    Scanner sc = new Scanner(System.in);
    int sal;
    String name;
    double hra, da, ntsal;

    public void read() {

        System.out.println("enter the name of employee");
        name = sc.next();

        System.out.println("enter the salary of employee");
        sal = sc.nextInt();

        hra = sal * 0.12;
        da = sal * 0.05;
        ntsal = sal + da + hra;

    }

}

class show extends student {
    public void show() {

        System.out.println("\n" + name + "\t\t" + sal + "\t\t" + hra + "\t\t" + da + "\t\t" + ntsal);

    }
}

class display extends show {
    public void dis() {
        System.out.println("\nname\t\tsal\t\thra\t\tda\t\tntsal");
    }

}

public class inheritancestructure {

    public static void main(String args[]) {

        display a1 = new display();
        a1.read();
        a1.dis();
        a1.show();

    }
}
