public class finalModifier {
    final String name = "Prashant";
    void updateName(){
        System.out.println("Update Name" + name);
    }
    public static void main(String[] args){
        System.out.println("Final method called");
        finalModifier obj = new finalModifier();
        obj.updateName();
    }
}