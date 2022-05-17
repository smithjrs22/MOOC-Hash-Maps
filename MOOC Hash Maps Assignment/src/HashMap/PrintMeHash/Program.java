package HashMap.PrintMeHash;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    //methods
    //prints all the keys in the hashmap
    //use for each loop
    public static void printKeys(HashMap<String,String> hashmap){
        // syntax for(type var: array) {statements using var;}
        //keySet() returns a view of keys in a map
        for(String key : hashmap.keySet() ){
            System.out.println(key);
        }
    }
    //prints keys in hashmap given as a parameter which contain the given string as a parameter
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for(String key : hashmap.keySet()){
            if (key.contains(text)){System.out.println(key);}
        } 
    }
    //prints value given hashmap which contains the given string
    //entrySet() creates a set out of same elements in the hashmap
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (Map.Entry<String, String> abbreviationMap : hashmap.entrySet()) {
            if (abbreviationMap.getKey().contains(text)) {
                System.out.println(abbreviationMap.getValue());
            }
        }
    }


}
