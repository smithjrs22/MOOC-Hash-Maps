package Abbreviations;
import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    //using hashmap as an field/attribute of abbreviations
    private final Map<String, String> abbreviationMap = new HashMap<>();
    
    //constructor with no paramenters
    public Abbreviations(){}

    //methods
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviationMap.put(abbreviation, explanation);
    }
    //checks to see if abbreviation already added; return true if true otherwise false
    //get abbrevation make sure not equal to null
    public boolean hasAbbreviation(String abbreviation){
        return abbreviationMap.get(abbreviation) !=null; 
    }
    //finds the explanation 
    public String findExplanationFor(String abbreviation){
        return abbreviationMap.get(abbreviation);
    }
}
