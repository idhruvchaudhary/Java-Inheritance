import java.util.*;

class a {

    void value() {

        Scanner sc = new Scanner(System.in);
        int v;

        System.out.println("enter the value ");
        v = sc.nextInt();

        double pi = 3.14;

        System.out.println(v * v * pi);
    }
}

class b {

    void pie() {

        a call = new a();
        call.value();

    }

}

public class aggrigriation {

    public static void main(String args[]) {

        b fill = new b();

        fill.pie();
    }

}
