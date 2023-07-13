class Human{
    //encapsulation
    private String name;
    //setters
    public void setName(String name){
        this.name = name;
    }
    //getters
    public String getName(){
        return name;
    }
}

public class Les6 {
    public static void main(String[] args) {
        Human yesBee = new Human();
        //name cannot be accessed
        // System.out.println(Human.name);
        yesBee.setName("yesBeee");
        System.out.println(yesBee.getName());
        //yesBeee

        Human res = new Human();
        System.out.println(res.getName());
        //null

    }   
}
