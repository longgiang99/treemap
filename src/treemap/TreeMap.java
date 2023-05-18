package treemap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        String vanBan1 = "Day day day la mot thong bao thu tien dien Tien dien thang nay cua ban la 200";
        String vanBan = vanBan1.toLowerCase();
        String[] chu = vanBan.split(" ");
        Map<String,Integer> phantach = new java.util.TreeMap<>();
        for( String tu : chu){
            if (phantach.containsKey(tu)){
                int count = phantach.get(tu);
                phantach.put(tu,count+1);
            }else {
                phantach.put(tu,1);
            }
        }
        for (Map.Entry<String,Integer> entry :phantach.entrySet()){
            System.out.println(entry.getKey()+" ---  "+ entry.getValue());
        }


//        Map<String,Integer> ten = new HashMap<>();
//        for (int i = 0; i < chu.length ; i++) {
//            if(!ten.containsKey(chu[i])){
//                ten.put(chu[i],1);
//            } else{
//                ten.put(chu[i],ten.get(chu[i])+ 1);
//            }
//        }
//        System.out.println(ten);
    }
}
