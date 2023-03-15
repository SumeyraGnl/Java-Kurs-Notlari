package day29_inheritance;

public class C04_Child extends C03_ParentClass{


        int c =20;
        int a ;

        String s = "Child class";
        String m ;

        public void method1(){
            System.out.println("child class method1");
        }

    public static void main(String[] args) {

            C03_ParentClass obj3 = new C03_ParentClass();
            obj3.a=20;
            obj3.b=22;
            obj3.s="p";
            obj3.t="k";
            obj3.method1();  //  parent method1 calisti
            obj3.method2();  //  parent method2 calisti

            C04_Child obj4 = new C04_Child();
            obj4.a=50;
            obj4.c=20;
            obj4.s="u";
            obj4.m="l";
            obj4.method1(); // child class method1






    }
}
