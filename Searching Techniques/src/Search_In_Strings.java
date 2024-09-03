// import java.util.Arrays;

public class Search_In_Strings {
    public static void main(String[] args) {
        String[] arr = {"Aayush","Dhanya","Piyush","Chavi"};
        // System.out.println(Arrays.toString(arr));
        String target = "Dhanya";
        System.out.println(Search(arr, target));
    }

    static String Search(String[] arr,String target ){
        if (arr.length == 0) {
            return "Array is Null";    
        }

        for (int i = 0; i < arr.length; i++) {
            String element = arr[i];
            if (element == target) {
                System.out.println(i);
                System.out.println(arr[i]);
                return "Successful";                
            }
        }
        return "failed";
    }
}
