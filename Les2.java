class Calculator{
    int result;
    public int add(int no1, int no2){
        result = no1 + no2;
        return result;
    }
}

class Les2 {
    public static void main(String a[]) {
        int no1 = 10;
        int no2 = 20;
        //Calculator cal => Creates a reference variable
        // new Calculator(); => Creates an object
        Calculator cal = new Calculator();
        System.out.println(cal.add(no1,no2));

        //Anonymous Object
        System.out.println(new Calculator().add(no1, no2));
    }
}
