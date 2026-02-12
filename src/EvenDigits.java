import java.util.Scanner;

public class EvenDigits {
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=array

    static void main() {
        int[] nums = {12,345,2,6,7896};
       System.out.println(findNumbers(nums));

       System.out.println(digits(54637));
        System.out.println(digits(-54637));

        System.out.println(digits2(-678954));


    }
    static int findNumbers(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(even(arr[i])){
                count++;
            }
        }return count;


    }

    //function to check whether a number contains even digits or not
    static boolean even(int i){

        int numberofDigits=digits(i);
        /*if(numberofDigits%2==0){
            return true;
        }return false;

         */
        return numberofDigits % 2==0;


    }

    //count number of digits in a number
    static int digits(int num){
        if(num<0)
        {
            num= num*-1;  //this is the case where negative numbers will get converted to the positive
        }

        if(num==0)
        {
            return 1;
        }

        int count =0;

        while(num>0){
            count++;
            num=num/10;//num/=10
        }
        return count;

    }
    static int digits2(int num){
        if(num<0)
        {
            num= num*-1;  //this is the case where negative numbers will get converted to the positive
        }
        return(int)(Math.log10(num)+1);

    }

}
