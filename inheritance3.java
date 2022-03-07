import java.util.*;

interface A {
    public void printA();

}

interface B extends A {
    public void printB();
}

interface C extends A {
    public void printC();
}

class inheritance3 implements B, C {
    public void printA() {
        System.out.println("a is created");
    }

    public void printB() {
        System.out.println("b is created");
    }

    public void printC() {
        System.out.println("c is created");
    }

    public static void main(String args[]) {
        inheritance3 x = new inheritance3();

        x.printA();
        x.printB();
        x.printC();
    }

}
