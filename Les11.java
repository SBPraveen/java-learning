interface Car{
    int noOfWheels = 4;
    void drive();
    void musicPlayer();
}

class Xuv700 implements Car{
    public void drive(){
        System.out.println("Driving Xuv700 and the no of wheels is "+ noOfWheels);
    }
    public void musicPlayer(){
        System.out.println("Playing music");
    }
}


public class Les11 {
    public static void main(String[] args) {
        Xuv700 mahindra = new Xuv700();
        mahindra.drive();
        mahindra.musicPlayer();
        System.out.println(Car.noOfWheels);
        // Car.noOfWheels = 10;
        //The final field Car.noOfWheels cannot be assigned

        //The type of cm is Car
        Car cm = new Xuv700();
        cm.drive();
    }
}
