package com.priyanshu;

public class GasStation_134 {
    public static void main(String[] args) {
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    static int canCompleteCircuit(int[] gas, int[] cost) {
     int gasSum=0;
     for(int g: gas) {
         gasSum+= g;
     }
     int costSum = 0;
    for(int c: cost) {
        costSum+= c;
    }
    if (gasSum < costSum){
        return -1;
    }
    int start = 0;
    int currentSum = 0;
        for (int i = 0; i < gas.length; i++) {
            currentSum += gas[i] - cost[i];
            if (currentSum< 0){
                currentSum = 0;
                start = i+1;
            }
        }
    return start;
    }
}


