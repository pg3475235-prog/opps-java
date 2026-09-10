import java.util.Vector;

public class vectorExp {
    public static void main(String[] args){

        Vector<String> vectorList = new Vector<>();

        vectorList.add("C");
        vectorList.add("C++");
        vectorList.add("Java");
        vectorList.add("Net");
        vectorList.add("Js");
        vectorList.add("PHP");

        System.out.println("Vector List:" + vectorList);

        vectorList.addFirst("C#");
        vectorList.addLast("Ruby");
        vectorList.add(3,"HTML");

        System.out.println("Updated vector List:"+ vectorList);

        if(vectorList.contains("Java")){
            System.out.println("Avaiable is the list");
        }
        else{
            System.out.println("Not Avaiable");
        }

        vectorList.set("Android");
        System.out.println("Updated List after replaing" + vectorList);

        //remove
        vectorList.remove(4);
        System.out.println("After removing" + vectorList);

        // remove first and last
        vectorList.removeFirst();
        vectorList.removeLast();
    }
    
}