package com.company;

public class Main {

    public static void main (String[] args) {
        /*String str = "ALMAFA";
        String strsplitted = "";
        for(int i=0; i<str.length();i++){
            strsplitted += str.charAt(i);
            System.out.println(strsplitted);
        }
        String name = "Kerekes Bálint Ádám József";
        String[] splitted = name.split(" ");
        String monogram = "";
        for(int i=0; i<splitted.length; i++){
            monogram += splitted[i].charAt(0);
        }
        System.out.println(monogram);*/
        double x[] ={7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement( x ));
        int number=13, a=2;
        System.out.printf("%d", getBit(number, a));
        System.out.printf(" ");
        System.out.printf("%d", getBitNumber(number));
        double[] array = {1, 2, -6, 3.996, 233};
        System.out.printf(" ");
        System.out.printf("%f", mean(array));

    }
    public static double mean(double array[]){
        int lenght = array.length;
        double sum=0, average;
        for(int i=0; i<lenght; i++){
            sum += array[i];
        }
        average = sum/lenght;
        if(sum != 0){return average;}
        else{return Double.NaN;}
    }
    public static int getBitNumber(int number) {
        int i = 0;
        int[] binary;
        binary = new int[20];
        while (number > 0) {
            if (number % 2 == 0) {
                binary[i] = 0;
            } else {
                binary[i] = 1;
            }
            number = number / 2;
            i++;
        }
        int counter=0;
        for(int j=0; j<i; j++){
            if(binary[j]==1){counter += 1;}
        }
        return counter;
    }
    public static int getBit(int number, int a){
        int i=0;
        int [] binary;
        binary = new int[20];
        while (number>0){
            if(number%2==0){binary[i]=0;}
            else {binary[i]=1;}
            number = number/2;
            i++;
        }
        if(a<=i){
            return binary[a];
        }
        else{
            return -1;
        }
    }
    public static double maxElement(double array[]){
        double max = Double.NEGATIVE_INFINITY;
        for( int i=0; i<array.length; ++i ){
            if( array[i] > max){
                max = array[ i ];
            }
        }
        return max;
    }
}
