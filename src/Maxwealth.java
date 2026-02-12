public class Maxwealth {

    //https://leetcode.com/problems/richest-customer-wealth/description/?envType=problem-list-v2&envId=array
    static void main() {

    }
    public int max(int[][]accounts){
        //person=rol
        //account =col
        int max_wealth =Integer.MIN_VALUE;
        for (int[] ints : accounts) { //when you start a new col, take a new sum for that row

            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
                if (sum > max_wealth) {
                    max_wealth = sum;
                }


            }

        }
        return max_wealth;
    }

}
