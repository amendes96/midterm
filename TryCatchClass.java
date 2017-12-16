package Exceptionpkg;

public class TryCatchClass {

    public static void main(String[] args) {

        //try catch is used mostly to catch errors in a certain ethod
        try {

            int a = 7;
            int b = 18;

            System.out.println(a + b);
            System.out.println("Java");
            System.out.println("Hello");
            System.out.println(2/0); //here's the error because we cannot any number by zero
            System.out.println("Hello");

        }catch(Exception e){
            System.out.println("Error has occurred in the previous method");
            System.out.println("------------");
            }
            //
        finally{
            System.out.println("Java");
            System.out.println("Hello");
        }
    }
}
