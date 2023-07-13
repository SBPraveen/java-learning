class Mobile{
    String brand;
    int price;
    // static variable
    static String type;

    //constructor
    public Mobile(){
        brand = "initBrand";
        price=0; 
        System.out.println("Inside the constructor");
    }
    //parameterized constructor
    public Mobile(String brand, int price){
        this.brand = brand;
        this.price=price; 
        System.out.println("Inside the constructor");
    }

    //static block
    static{
        type="initType";
        System.out.println("Inside the static block");
    }

    public void show(){
        System.out.println("brand "+brand+" price "+price+" type "+type);
    }

    //static method
    public static void showStatic(Mobile m){
        System.out.println("showStatic => type : "+type+" brand "+m.brand+" price "+m.price);
    }
}

public class Les5 {
    public static void main(String[] args) {

        //Class.forName("Mobile");

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile("Nokia", 10);

        Mobile.type = "smartphone";

        m2.brand = "apple";
        m2.price= 90000;

        m1.show();
        //brand initBrand price 0 type smartphonee
        m2.show();
        //brand apple price 90000 type smartphone
        m3.show();

        Mobile.showStatic(m2);
        // showStatic => type : smartphone brand apple price 90000

    }
}
