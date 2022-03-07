import java.util.*;

//hirarchical inheritance

class a {
    void fun1() {
        System.out.println("hi i'm dhruv");

    }
}

class b extends a {
    void fun2() {
        System.out.println("hello world");
    }
}

class c extends a {
    void fun3() {
        System.out.println("here is java");
    }
}

class d extends a {
    void fun4() {
        System.out.println("here is web dev");
    }
}

public class inheritance2 {
    public static void main(String args[]) {
        b n = new b();
        c n1 = new c();
        d n2 = new d();

        n2.fun4();
        n1.fun3();

        n.fun2();
        n.fun1();

    }

}
