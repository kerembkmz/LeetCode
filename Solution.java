import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int thenumber = romanToInt("MCMXCIV");
        System.out.println(thenumber);
    }


    public static int romanToInt(String s) {
        HashMap<String, Integer> romanNumbersToNumeral = new HashMap<String, Integer>();
        romanNumbersToNumeral.put("I", 1);
        romanNumbersToNumeral.put("V", 5);
        romanNumbersToNumeral.put("X", 10);
        romanNumbersToNumeral.put("L", 50);
        romanNumbersToNumeral.put("C", 100);
        romanNumbersToNumeral.put("D", 500);
        romanNumbersToNumeral.put("M", 1000);
        romanNumbersToNumeral.put("IV", 4);
        romanNumbersToNumeral.put("IX", 9);
        romanNumbersToNumeral.put("XL", 40);
        romanNumbersToNumeral.put("XC", 90);
        romanNumbersToNumeral.put("CD", 400);
        romanNumbersToNumeral.put("CM", 900);

        Integer finalNumber = 0;
        int IVCount = substringCounter(s, "IV");
        String s1 = s.replaceAll("IV" , "");
        int IXCount = substringCounter(s1, "IX");
        String s2 = s1.replaceAll("IX" , "");
        int XLCount = substringCounter(s2, "XL");
        String s3 = s2.replaceAll("XL" , "");
        int XCCount = substringCounter(s3, "XC");
        String s4 = s3.replaceAll("XC" , "");
        int CDCount = substringCounter(s4, "CD");
        String s5 = s4.replaceAll("CD" , "");
        int CMCount = substringCounter(s5, "CM");
        String s6 = s5.replaceAll("CM" , "");
        int ICount = substringCounter(s6, "I");
        int VCount = substringCounter(s6, "V");
        int XCount = substringCounter(s6, "X");
        int LCount = substringCounter(s6, "L");
        int CCount = substringCounter(s6, "C");
        int DCount = substringCounter(s6, "D");
        int MCount = substringCounter(s6, "M");



        int IVValue = IVCount * romanNumbersToNumeral.get("IV");
        int IXValue = IXCount * romanNumbersToNumeral.get("IX");
        int XLValue = XLCount * romanNumbersToNumeral.get("XL");
        int XCValue = XCCount * romanNumbersToNumeral.get("XC");
        int CDValue = CDCount * romanNumbersToNumeral.get("CD");
        int CMValue = CMCount * romanNumbersToNumeral.get("CM");
        int IValue = ICount * romanNumbersToNumeral.get("I");
        int VValue = VCount * romanNumbersToNumeral.get("V");
        int XValue = XCount * romanNumbersToNumeral.get("X");
        int LValue = LCount * romanNumbersToNumeral.get("L");
        int CValue = CCount * romanNumbersToNumeral.get("C");
        int DValue = DCount * romanNumbersToNumeral.get("D");
        int MValue = MCount * romanNumbersToNumeral.get("M");

        finalNumber += IVValue + IXValue + XLValue + XCValue + CDValue + CMValue + IValue + VValue + XValue + LValue + CValue + DValue + MValue;
        return finalNumber;


    }

    static int substringCounter(String str, String substring) {
        if (str.contains(substring)) {
            return 1 + substringCounter(str.replaceFirst(substring, ""), substring);
        }
        return 0;
    }
}