class Computer {
    private String founder = "yesBee";

    public void showFounder() {
        System.out.println(founder);
    }
    public void showCeo() {
        System.out.println("SB");
    }

}

class Laptop extends Computer {
     private String manufacturer = "Apple";

    public void showManufacturer() {
        System.out.println(manufacturer);
    }
    public void show() {
        System.out.println("founder");
    }
}

final class Calc{
    public void name(){
        System.out.println("Praveen");
    }
}

// class AdvCalc extends Calc{ 
// }
//! The type AdvCalc cannot subclass the final class Calc

class myCalc{
    public final void name(){
        System.out.println("Praveen");
    }
}

class myCalc1 extends myCalc{ 
    // public final void name(){
    //     System.out.println("Praveen");
    // }
    //! Cannot override the final method from myCalc
}


class Les9 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        lap.showFounder();
        // lap.showManufacturer(); 
        //The above code doesnt work because Dynamic Method Dispatch works only for overridden method.

        final int no = 10;
        // no = no + 1;
        //! cannot assign a value to final variable no
        System.out.println(no);

        //upcasting
        Computer lap1 =(Computer) new Laptop();
        //The above code is same as Computer lap = new Laptop();
        lap1.showCeo();
        //downcasting
        Laptop lap2 = (Laptop) lap1;
        lap2.showManufacturer();


    }

}
