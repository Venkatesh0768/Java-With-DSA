public class BinarytoDecimal {
    public static void binarytodec(int binnum){

        int pow =-0;
        int dec=0;
        while(binnum>0){
            int lastdigit = binnum%10;
            dec = dec + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println(dec);

    }
    public static void main(String[] args) {
        binarytodec(010);
    }
}
