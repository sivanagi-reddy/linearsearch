import java.util.Arrays;

public class Searchin2darray {
    static void main() {
        int[] [] arr= {
                { 1,2,3},
                {13,21,34,41},
                {11,22,33,44},
        };
        int target=34;
        int[] ans=arraysearch(arr,target);// format of return value {row,column}
        System.out.println(Arrays.toString(ans));
    }
    static int [] arraysearch(int[] [] arr,int target){
        if(arr.length==0){
            return new int[] {-1,-1};
        }

        for(int row=0;row<arr.length;row++){
            for(int j=0;j<arr[row].length;j++) {


                if (arr[row][j] == target) {
                    return new int[]{row, j};

                }
            }
        }return new int []{-1,-1};



    }
}
