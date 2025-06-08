package leetcode;

public class RemoveOuterMostParanthesis {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
    }
    public static String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp=s.charAt(i);
            if(temp=='('){
                if (count>0){
                    stringBuilder.append(temp);
                }
                count++;
            }
            if(temp==')'){
                count--;
                if (count>0){
                    stringBuilder.append(temp);
                }

            }

        }
        return stringBuilder.toString();

    }
}
