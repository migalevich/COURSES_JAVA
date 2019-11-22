package usefulInfo;

//class A {
//    public  int stInt = 10;
//    public void m(int k) {
//        System.out.println("class A, method m : " + ++k);
//    }
//
//}
//class B extends A {
//    public  int stInt = 20;
//     public  void m(int k) {
//        System.out.println("class B, method m : " + k++);
//        //return k;
//    }
//}
//class MainClass {
//    public static void main(String args[]) {
//        A a = new B();
//     //   a.m(34);
//      //  A b = new A();
//      //  b.m(22);
//        System.out.println(a.stInt);
//
//    }
//}
/* ------------------ */
class TestClass {
    public static void main(String[] args) {
        Base sub = new Sub();
        sub.test();
        Sub sub1 = new Sub();
        sub1.test();

    }
}
class Base {
    public static void test() {
        System.out.println("Base.test()");
    }
}
class Sub extends Base {
    public static void test() {
        System.out.println("Sub.test()");
    }
}


class A {
    static int i = 0;
    public int increment() {
        return ++i;
    }
}

 class B extends A {
    static int i = 10;
    public int increment() {
        return ++i;
    }

    public static void main(String[] args) {
        A obj = (A) new B();
        System.out.println(obj.increment());
    }
}