public class Arthmetic{

    int a = 10;
    int b = 0;

    void add(){
        // try{
        // int add =  a + b;
        // System.out.println("Addition of two number is " + add);
        // }
        // catch(ArithmeticException e){
        //         System.out.println("Exception error" + e); 
        // }
        int add =  a + b;
        System.out.println("Addition of two number is " + add);
    }
    void division(){
        try {
            int division = a / b;
            System.out.println("Division of two number is " + division);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception error: " + e);
        }
        catch (Exception e){
            System.out.println("Exception error: " + e);
        }
        finally{
            System.out.println("Final done ");
        }

    }
    public static void main(String[] args){
        Arthmetic obj = new Arthmetic();

        obj.division();
        obj.add();


    }
}