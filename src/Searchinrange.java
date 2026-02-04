import java.util.Arrays;
public class Searchinrange {
    static void main() {
        int []arr= {1,2,3,56,78,98,6};
        int target=56;
        int start;
        int end;
        System.out.println(linearSearch(arr,target,1,4));
    }
    public static int linearSearch(int []arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }

        //run a loop

        for(int index=start;index<=end;index++){
            if(arr[index]==target)
                return index;
        }
        return -1;
    }


}
