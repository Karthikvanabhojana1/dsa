package org.example;

import java.util.HashMap;
import java.util.Map;

public class IntegertoRoman {
    public static String intToRoman(int num) {
        String decimal[]={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String tensposition[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundreds[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thounsands[]={"","M","MM","MMM"};
        return thounsands[num/1000] + hundreds[(num%1000)/100] + tensposition[(num%100)/10] + decimal[num%10];

    }
    public static void main(String[] args) {
        int  value=58;
        System.out.println(intToRoman(value));

    }
}
