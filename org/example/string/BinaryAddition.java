package org.example.string;

public class BinaryAddition {
    public static void main(String[] args) {
        String a="1";
        String b="111";
        String res=addBinary(a,b);
        System.out.println("Res "+res);

    }
    public static String addBinary(String a, String b) {
        char arr[]=a.toCharArray();
        char barr[]=b.toCharArray();
        int carry=0;
        int i= arr.length-1, j =barr.length-1;
        StringBuilder sb=new StringBuilder();
        while(i>=0 && j>=0){
            int res=Integer.parseInt(String.valueOf(arr[i]))+Integer.parseInt(String.valueOf(barr[j]))+carry;
if(res==2){
   carry=1;
   res=0;
}
else if(res==3){
    carry=1;
    res=1;
}
else{
    carry=0;

}
sb.append(String.valueOf(res));
            i--;
            j--;
        }

while (i>=0){
    int res=Integer.parseInt(String.valueOf(arr[i]))+carry;
    if(res==2){
        carry=1;
        res=0;
    }
    else if(res==3){
        carry=1;
        res=1;
    }
    else{
        res=1;
        carry=0;

    }
    i--;
    sb.append(String.valueOf(res));

}
        while (j>=0){
            int res=Integer.parseInt(String.valueOf(barr[j]))+carry;
            if(res==2){
                carry=1;
                res=0;
            }
            else if(res==3){
                carry=1;
                res=1;
            }
            else{
                res=1;
                carry=0;

            }
            j--;
            sb.append(String.valueOf(res));

        }
        if(carry>0){
            sb.append(String.valueOf(carry));

        }
        sb.reverse();
return sb.toString();
    }
}
