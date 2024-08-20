package DSALeetcode.src.main.java.org.example.java.basics.day1;

public class TypeCasting {
    public static void main(String[] args) {
        byte b1=123;

        System.out.println("b1 "+ b1);
        int i=267;
        b1=(byte) i;
        System.out.println("after typecasting "+b1);

//type casting if number of bytes of data base in right hand side is greater than left hand side
        float f1=5.7f;
        i=(int) f1;
        System.out.println("i after type casting " +i);
        int i2=b1;

        //type conversion  if number of bytes of data base in left hand side is greater than right hand side
        System.out.println("i2 after conversion "+i2);
    }
}
