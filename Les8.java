//Import the packages
import Les8Package.Pkg1;
import Les8Package.Pkg2;
import Les8Package.SubPackage.*;

class Parent{
    public void show(int n){
        System.out.println("This is the parent class show method");
    }
}
class Child extends Parent{
    @Override
    public void show(int n){
        System.out.println("This is the child class show method");
    }
}


public class Les8 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show(1);

        //use the packages
        Pkg1 p1 = new Pkg1();
        p1.show();
        Pkg2 p2 = new Pkg2();
        p2.show();
        Pkg3 p3 = new Pkg3();
        p3.show();
        Pkg4 p4 = new Pkg4();
        p4.show();
    }
}
