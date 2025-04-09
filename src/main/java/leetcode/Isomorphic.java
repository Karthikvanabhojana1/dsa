package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapvalues=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mapvalues.containsKey(s.charAt(i)) && !mapvalues.containsValue(t.charAt(i))){
                return false;
            }
            if(!mapvalues.containsKey(s.charAt(i)) && mapvalues.containsValue(t.charAt(i))){
                return false;
            }
            if(mapvalues.containsKey(s.charAt(i))){
                if(mapvalues.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }

            mapvalues.put(s.charAt(i),t.charAt(i));

        }
        return true;

    }
}
