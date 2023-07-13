class Calculator {
    public Calculator() {
        System.out.println("Class Calculator default constructor");
    }

    public Calculator(int n) {
        System.out.println("Class Calculator parameterized constructor");
    }
    public void add(int no1, int no2){
        int res = no1 + no2;
        System.out.println("Calculator add "+ res);
    }
    public void sub(int no1, int no2){
        int res = no1 - no2;
        System.out.println("Calculator add "+ res);
    }
}

class AdvancedCalculator extends Calculator {
    public AdvancedCalculator() {
        // invoke parent class parameterized constructor
        super(1);
        System.out.println("Class AdvancedCalculator default constructor");
    }

    public AdvancedCalculator(int n) {
        // this method will call the default constructor
        this();
        System.out.println("Class AdvancedCalculator parameterized constructor");
    }
    public void mul(int no1, int no2){
        int res = no1 * no2;
        System.out.println("Calculator add "+ res);
    }
}
class VeryAdvancedCalculator extends AdvancedCalculator {
    public void div(int no1, int no2){
        int res = no1 / no2;
        System.out.println("Calculator add "+ res);
    }
}

public class Les7 {
    public static void main(String[] args) {
        AdvancedCalculator b1 = new AdvancedCalculator(100);
        System.out.println(b1);
        System.out.println("--------------------------------------------");
        VeryAdvancedCalculator cal = new VeryAdvancedCalculator();
        cal.add(1,2); 
        cal.mul(1,2); 
        cal.div(2,2); 

    }
}
