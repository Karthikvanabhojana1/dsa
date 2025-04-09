package leetcode;

public class StringtoInteger {
    public int myAtoi(String s) {
        boolean isnegative=false;
        StringBuilder total=new StringBuilder();
        s=s.trim();
        for (int i = 0; i < s.length(); i++) {
            Character chs=s.charAt(i);
            if(chs=='-' && i==0){
                isnegative=true;
            }
            else if(Character.isDigit(chs)){
                total.append(chs);
            }
            else {
                if(total.isEmpty()){
                    return 0;
                }
                return Integer.parseInt(total.toString());
            }
        }
        if(isnegative){
            total.insert(0,'-');
        }
        return Integer.parseInt(total.toString());

    }

}
