package I Owe You;
import java.util.HashMap;
import java.util.Map;

public class IOU {
    //attribute
    private HashMap<String, Double> iouMap = new HashMap<>();
    //constructor
    public IOU(){}
    //saves the amt owed and person owed to IOU
    public void setSum(String toWhom, double amount){
        iouMap.put(toWhom, amount);
    }
    //returns amt owed to person whose name is given as parameter, if no person found returns 0
    public double howMuchDoIOweTo(String toWhom){
        for (Map.Entry<String, Double> iouMap : iouMap.entrySet()) {
            if (iouMap.getKey().equalsIgnoreCase(toWhom)) {
                return iouMap.getValue();
            }
        }
        return 0;
    }
}
