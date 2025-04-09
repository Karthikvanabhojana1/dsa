package leetcode;

public class RotatedArray
{
    public boolean rotateString(String s, String goal) {
        StringBuilder stringBuilder=new StringBuilder(s);
        stringBuilder.append(s);
        if(stringBuilder.toString().equals(goal)){
            return true;
        }
        return false;
    }
}
