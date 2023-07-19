//Custom error
class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}
//throws
class Divide{
    public int calculate(int a, int b) throws ArithmeticException{
        return a/b;
    }
}
public class Les13 {    
    public static void main(String[] args) {
        int i = 1;
        int arr[] = new int[5];
        try {
            if(i == 1){
                //throw built in exception
                throw new ArithmeticException("Divide by one exception");
            }
            if(i == 2){
                //throw custom exception
                throw new MyException("Divide by two exception");
            }

            int j = 20 / i;
            System.out.println(j);
            arr[6] = 7;

            //throws
            Divide div = new Divide();
            div.calculate(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException catch block " + e);
            // e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException catch block " + e);
        }
        catch(Exception e){
            System.out.println("  catch block " + e);
        }
        System.out.println("After the try block");
    }
}
