enum Status{
    //For running and pending default constructor will be called
    Running, Failed(404), Pending, Success(200);

    private int statusCode;

    //default constructor
    private Status(){
        this.statusCode = 111;
    }
    //parameterized constructor
    private Status(int statusCode){
        this.statusCode = statusCode;
    }

    public void getCode(){
        System.out.println(this.statusCode);
    }

    public void setCode(int statusCode){
        this.statusCode = statusCode;
    }
}

@FunctionalInterface
interface ShowInterface{
    void show(int i);
}
interface AddInterface{
    int add(int i, int j);
}

public class Les12 {
    public static void main(String[] args) {
        Status sta = Status.Pending;
        System.out.println(sta);
        //Pending
        Status staAll[] = Status.values();
        for(Status s: staAll){
            System.out.println(s+ " " + s.ordinal());
        }
        //Running 0
        //Failed 1
        //Pending 2
        //Success 3

        //Condition checking
        if(sta == Status.Pending){
            System.out.println("Pending Pending Pending if");
        }

        //Status codes
        sta.getCode();
        // 111
        sta.setCode(101);
        sta.getCode();
        //101

        //Functional interfaces and lambda functions
        ShowInterface obj = new ShowInterface(){
            public void show(int i){
                System.out.println("Functional interfaces obj"+ i);
            }
        };
        //||The above code can be shortened using Lambda functions
        ShowInterface obj1 = (int i) -> {
                System.out.println("Functional interfaces obj1"+ i);
            };

        //More shortened version
        ShowInterface obj2 = i -> System.out.println("Functional interfaces obj1"+ i);

        obj.show(10);
        obj1.show(20);
        obj2.show(30);

        AddInterface add1 = (int i, int j) -> i+j ;

        System.out.println(add1.add(6,6));
        //12
    }
}
