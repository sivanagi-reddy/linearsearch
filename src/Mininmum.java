public class Mininmum {
    static void main() {
        int[] arr = {1,2,32,43,54,65,78};

    }
    static int min(int[]arr)
    {
        if(arr.length==0)
        {
            return 0;
        }
        //run the loop
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }return min;

    }

}
