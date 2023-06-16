public class FunctionOverloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b,int c){
        return a+b+c;
    }
//    using Data type
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(sum(4,5,8));
        System.out.println(sum(22.4f,55.6f));

    }

//
}
