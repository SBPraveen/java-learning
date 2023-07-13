class Les1 {
    public static void main(String a[]) {
        //Nos can be seperated by _ for easy understanding
        int num1 = 3_33_333;
        int num2 = 3;
        int result = num1 + num2;
        double amount = 2.3;
        // When int are stored to double they get converted to double
        double amount3 = 2;
        float amount1 = 2.3f;
        char car = 'a';
        //The value a gets converted to "b"
        car++;
        boolean b = true;
        long aa = 1234l;
        System.out.println(result);
        System.out.println(amount);
        System.out.println(amount1);
        System.out.println(car);
        System.out.println(b);
        System.out.println(aa);
        System.out.println(amount3);

        //Casting
        //EG1
        float no1 = 2.3f;
        int no2 = (int)no1;
        System.out.println(no2);
        //EG2: Byte range is -128 to 127 which is 256 nos in total. So when integers are converted to bytes then modulo takes place. So thats the reason 257%256 we see 1 as op
        byte no3 = 127;
        int no4 = 257;
        no3 = (byte)no4;
        System.out.println(no3);

        //Operators
        no4 += 2;
        no4 *= 5;
        no4++;// post increment
        ++no4;// pre increment
        no4--;
        //comparision ==
        //not equal  !=
        //And Or Not => && || !


        //Conditional statement
        if(no4 < no3){
            System.out.println("no3 is greater");
        }
        else if(no4 == no3){
            System.out.println("no4 is equal to no3");
        }
        else {
            System.out.println("no4 is greater");
        }

        //ternary operator 
        int noEven = 20;
        noEven = noEven %2 == 0 ? 2 : 3;

        //switch
        int noSwitch = 1;
        switch(noSwitch){
            case 1:
                System.out.println("This is one");
                break;
            case 2:
                System.out.println("This is two");
                break;
            default:
                System.out.println("Cannot read this no");
                break;
        }


        //Loops => while, do while, for
        for(int i=0; i<5; i++){
            System.out.println("Loop"+" "+i);
        }

    }
}
