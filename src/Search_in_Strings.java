import java.util.*;
public class Search_in_Strings {
    public static void main(String[] args) {
        String name="eswarreddyakkili";
        char target= 'w';
        // System.out.println(linearSearch(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));


    }

    static boolean linearSearch2(String str,char target){
        if(str.length()==0){
            return false;

        }
        for(char ch :str.toCharArray()){
            if(ch==target){
                return true;
            }

        }
        return false;
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
