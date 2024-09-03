//In the array search for 14
//arr = [10,13,12,5,31,14,6]


public class Linear_Search {
    public static void main(String[] args) {
        int[] arr =  {10,13,12,5,31,14,6};
        int target = 14;
        int ans = ls(arr,target);
        System.out.println(ans);

    }

    static int ls(int[] arr,int target){
        if (arr.length == 0) {
            return -1;    
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target){
                //return i;
                return element;
            }
        }
        return -1;
    }
}
