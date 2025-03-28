package leetcode;

public class StringPalidrome {
    public static void main(String[] args) {
        String s="m: am";
        System.out.println(isPalindrome(s));
    }

        public static boolean isPalindrome(String s) {
            if (s.isEmpty()) {
                return true;
            }

            int i=0;
            int j=s.length()-1;
            while(i<=j){
                if(!Character.isLetterOrDigit(s.charAt(i))){
                    i++;
                }
                else if(!Character.isLetterOrDigit(s.charAt(j)) ){
                    j--;
                }
                else{


                    if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
                        return false;

                    i++;
                    j--;
                }
            }
            return true;

        }

}
