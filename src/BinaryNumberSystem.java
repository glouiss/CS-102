public class BinaryNumberSystem {
    public static void main(String[] args) {
        int binary = binaryToDecimal("00001111");
        System.out.println(binary);

    }

    public static int binaryToDecimal(String bin) {
        int decimalValue = 0;
        int length = bin.length();


        for (int i = bin.length() - 1; i >= 0; i--) {

            char digits = bin.charAt(bin.length() - 1 -i);

            int digitValue = 0;
            if (digits == '1') {
                digitValue = 1;

}
            int currentDecimal = (int) (Math.pow(2,i)) * digitValue;
            decimalValue += currentDecimal;
        }
        return decimalValue;
    }
}