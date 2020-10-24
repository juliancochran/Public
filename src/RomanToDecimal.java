/**
 * Javadoc goes here
 */
public class RomanToDecimal {
    // no private data, only helper methods

    /**
     * Converts a string to a valid decimal (base-10 value)
     * @param roman Must be an uppercase string
     * @return
     */
    public static int romanToDecimal(String roman)  {
        /*if(roman.equals("NA_NA_BOO_BOO"))   {
            System.out.println("NA NA BOO BOO TO YOU TOO YOU FOO!");
            return -1;
        }*/
        int sum = 0;
        String letter;  // I will explain here
        for(int i = 0; i < roman.length(); i++) {
            letter = roman.substring(i, i+1);
            if(letter.equals("I"))
                sum += 1;
            else if(letter.equals("V"))
                sum += 5;
            else if(letter.equals("X"))
                sum += 10;
            else if(letter.equals("L"))
                sum += 50;
            else if(letter.equals("C"))
                sum += 100;
            else if(letter.equals("D"))
                sum += 500;
            else if(letter.equals("M"))
                sum += 1000;
            else {    // user supplied a bad character
                //System.out.println(letter);
                return -1;
            }
        }

        //now handle invariants
        if(roman.indexOf("IV") != -1 || roman.indexOf("IX") != -1)
            sum -= 2;
        if(roman.indexOf("XL") != -1 || roman.indexOf("XC") != -1)
            sum -= 20;
        if(roman.indexOf("CD") != -1 || roman.indexOf("CM") != -1)
            sum -= 200;

        return sum;
    }

    /**
     * Use this helper method to determine if a Roman numeral is
     * illogically constructed.
     * @param decimal value previously calculated by romanToDecimal
     * @return the Roman numeral String version of a decimal value
     */
    private static String decimalToRoman(int decimal)  {
        String roman = "";
        while(decimal >= 1000) {
            roman += "M";
            decimal -= 1000;
        }
        while(decimal >= 900)   {
            roman += "CM";
            decimal -= 900;
        }
        while(decimal >= 500)   {
            roman += "D";
            decimal -= 500;
        }
        while(decimal >= 400)   {
            roman += "CD";
            decimal -= 400;
        }
        while(decimal >= 100)   {
            roman += "C";
            decimal -= 100;
        }
        while(decimal >= 90)    {
            roman += "XC";
            decimal -= 90;
        }
        while(decimal >= 50)   {
            roman += "L";
            decimal -= 50;
        }
        while(decimal >= 40)    {
            roman += "XL";
            decimal -= 40;
        }
        while(decimal >= 10)    {
            roman += "X";
            decimal -= 10;
        }
        while(decimal >= 9)    {
            roman += "IX";
            decimal -= 9;
        }
        while(decimal >= 5) {
            roman += "V";
            decimal -= 5;
        }
        while(decimal >= 4) {
            roman += "IV";
            decimal -= 4;
        }
        while(decimal >= 1) {
            roman += "I";
            decimal -= 1;
        }
        return roman;
    }

    public static void main(String[] args)  {
        /*System.out.println("Input: CXIX => output: " +
                romanToDecimal("cxix".toUpperCase()));
        System.out.println("Input: MMCIX => output: " +
                romanToDecimal("mmcix".toUpperCase()));
        System.out.println("YOUR MOM => output: " +
                romanToDecimal("YOUR MOM".toUpperCase()));
        System.out.println("IXIXIXIX => output: " +
                romanToDecimal("ixixixix".toUpperCase()) + " " +
                decimalToRoman(romanToDecimal("ixixixix".toUpperCase())));
        */
        for(String roman : args) {
            int decimal = romanToDecimal(roman.toUpperCase());
            System.out.print("Input: " + roman + " ==> Output: ");
            if(decimal == -1)
                System.out.println("invalid");
            else    {
                if(decimalToRoman(decimal).equals(roman.toUpperCase())) {
                    System.out.println(romanToDecimal(roman.toUpperCase()));
                }
                else    {
                    System.out.println("invalid Roman numeral");
                }
            }
        }
        System.out.println("End of program");
    }
}
