public class BinaryNumberSyatem {
    public static void main(String[] args) {
        int binary = binaryToDecimal("00001111");
        System.out.println(binary);
    }
    public static int binaryToDecimal(String bin) {
        int decimalValue = 0;
        int length = bin.length();

        for (int i = 0; i < bin.length(); i++) {


            char digits = bin.charAt(length - 1 - i);

            int digitValue = (digits == '1') ? 1 : 0;

            int currentDecimal = (int)(Math.pow(2, i)) * digitValue;

            decimalValue += currentDecimal;
        }

        return decimalValue;
    }
}