package Nicknames;
import java.util.HashMap;//must have for Hashmap

public class Main {
    public static void main(String[] args)  {
    //Nicknames
    HashMap<String, String> nicknamesMap = new HashMap<>();

    // to add nameofvariable.put(key, value);
    // put does the adding
    nicknamesMap.put("Matthew", "Matt");
    nicknamesMap.put("Micheal", "Mix");
    nicknamesMap.put("Arthur", "Artie");
    // get Matthews nickname and print
    // .get gets the name
    System.out.println(nicknamesMap.get("Matthew"));

    }
}
