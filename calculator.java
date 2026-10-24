import java.util.Scanner;
class Add {
    void add(int a,int b) {
        System.out.println(a+b);
    }
}
class Sub extends Add {
    void sub(int a,int b) {
        System.out.println(a-b);
    }
}
class Mul extends Sub {
    void mul(int a,int b) {
        System.out.println(a*b);
    }
}

 