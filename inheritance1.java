//import java.util.*;

// multiple level inherityance

class a {

    void fun1() {
        System.out.println("dhruv chaudhary");
    }

}

class b extends a {

    void fun2() {

        System.out.println("hey it's dhruv");
    }

}

class c extends b {

    void fun3() {
        System.out.println(" web dev");
    }
}

class d extends c {

    void fun4() {
        System.out.println("soft.dev");
    }
}

public class inheritance1 {

    public static void main(String args[]) {

        d n = new d();

        n.fun4();
        n.fun3();
        n.fun2();
        n.fun1();
    }

}
