public class Subset {
    public static void findArray( String str , String ans , int i )
    {
        if (i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //yes Choice
        findArray(str, ans+ str.charAt(i), i+1);
        //no choice 
        findArray(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str =  "abc";
        findArray(str, "", 0);

    }
    
}
