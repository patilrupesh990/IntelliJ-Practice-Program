package com.bridgelabz.intellejprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
    static HashMap<String,Integer> hashMap=new HashMap<>();
    public void iterateUsingForLoop(HashMap<String,Integer> hashMap){
        System.out.println("Iterate Map Using Advance For Loop");
        for (String key:hashMap.keySet()){
            System.out.println("key:"+key+", value:"+hashMap.get(key));
        }
    }

    public void iterateUsingWhileLoop(HashMap<String,Integer>hashMap){
        System.out.println("Iterate Map Using While For Loop");
        Iterator<Map.Entry<String, Integer>> itr = hashMap.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("thhree",3);
        hashMap.put("four",4);
        hashMap.put("five",5);
        hashMap.put("six",6);
        IterateHashMap object=new IterateHashMap();
        object.iterateUsingForLoop(hashMap);
        object.iterateUsingWhileLoop(hashMap);
    }
}
