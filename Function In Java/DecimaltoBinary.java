public class DecimaltoBinary {
    public static void decitobin(int deci){
        int bin =0;
        int pow=0;
        while (deci>0){
            int reminder=deci%8;
            bin =bin + (reminder*(int)Math.pow(10,pow));
            pow++;
            deci=deci/8;

        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        decitobin(365);

    }
}
