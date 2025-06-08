package org.example;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int gascost=0, fuelCOst=0, currentfuel=0, start=0;
        for (int i = 0; i <gas.length ; i++) {
            gascost+=gas[i];

        }
        for (int i = 0; i <gas.length ; i++) {
            fuelCOst+=cost[i];

        }
        if(fuelCOst>gascost)
        {
            return -1
;        }
        for (int i = 0; i < gas.length; i++) {
            currentfuel+=gas[i]-cost[i];
            if(currentfuel<0){
                start=i+1;
                currentfuel=0;
            }
            
        }

        return start;
    }

    public static void main(String[] args) {
        int gas[] = {1,2,1};
        int cost[] = {1,2,1};
        System.out.println(canCompleteCircuit(gas,cost));


    }
}
