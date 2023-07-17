//||abstract class
abstract class Car {
    // Its up to the manufacturer to have the color implementation. But all cars should have colours
    public abstract void color();

    public void drive() {
        System.out.println("driving");
    }
}

class Nexon extends Car {
    public void color() {
        System.out.println("Red");
    }
}

//|| Nested class
class ParentClass {
    public void show() {
        System.out.println("From the parentClass");
    }

    class NestedClass {
        public void name() {
            System.out.println("From the nested class");
        }
    }

    // Only nested classes can be static not the parents
    static class NestedClass1 {
        public void name1() {
            System.out.println("From the nested class 1");
        }
    }
}

public class Les10 {
    public static void main(String[] args) {
        //Objects cannot be created from abstract classes
        // Car c1 = new Car();
        Nexon n1 = new Nexon();
        n1.drive();

        Car cn1 = new Nexon();
        cn1.color();

        //||Nested class
        ParentClass pc = new ParentClass();
        ParentClass.NestedClass nested = pc.new NestedClass();
        //If the nested class is static then objects can be created as below.
        ParentClass.NestedClass1 nested1 = new ParentClass.NestedClass1();

        nested.name();
        pc.show();
        nested1.name1();

        //||Anonymous Inner class
        Nexon n2 = new Nexon(){
        public void color(){
            System.out.println("Pink");
            }
        };
        n2.color();

        //||Anonymous Abstract Inner class
        Car c3 = new Car(){
            public void color() {
                System.out.println("yellow");
            }
        };
        c3.drive();
        c3.color();
    }
}
