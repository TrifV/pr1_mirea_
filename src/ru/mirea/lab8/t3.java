package ru.mirea.lab8;

public class t3 {
    public static void main(String[] args){
        int n = 2;
        calcSumOfNumsReqursive(n, 0);
    }

    public static void calcSumOfNumsReqursive(int n, int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        calcSumOfNumsReqursive(n/10, sum+n%10);
    }
}
