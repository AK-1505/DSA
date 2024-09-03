public class Minimum_Number {
    public static void main(String[] args) {
        int[] Aayush = {10,12,4,8,2,1,-10,-7};
        System.out.println(Min_Num(Aayush));
    }

    static int Min_Num(int[] Aayush){
        if (Aayush.length == 0) {
            System.out.println("Empty Array");
        }

        int ans = Aayush[0];
        for (int i = 0; i < Aayush.length; i++) {
            if(Aayush[i] < ans){
                ans = Aayush[i];
            }

        }
        return ans;
    }
}
