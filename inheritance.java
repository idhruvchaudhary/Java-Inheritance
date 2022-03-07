import java.util.*;

class a {

    void fun1() {
        System.out.println("dhruv");
    }
}

class b extends a {
    void fun2() {
        System.out.println("niraj");
    }
}

public class inheritance {

    public static void main(String args[]) {

        // a s1 = new a();
        b a1 = new b();
        a1.fun1();
        a1.fun2();

    }

}
