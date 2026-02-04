public class Search_in_Strings {
    public static void main(String[] args) {
        String name="eswar reddy akkili";
        char target= 'w';
        boolean ans=linearSearch(name,target);
        System.out.println(ans);



    }
    static boolean linearSearch(String str,char target){
        if(str.length()==0){
            return false;

        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){

                return true;
            }

        }
        return false;
    }
}
