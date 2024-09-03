public class String_element {
    public static void main(String[] args) {
        String A = "Dhanya";
        char target = 'a';
        System.out.println(Search(A, target));
    }
    
    static String Search(String A,char target ){
        if (A.length() == 0) {
            return "No String";    
        }

        for (int i = 0; i < A.length(); i++) {
            if (target == A.charAt(i)) {
                System.out.println(i);
                System.out.println(A.charAt(i));
                return "Successful";                
            }
        }
        return "failed";
    }
}
