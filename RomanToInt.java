class RomanToInt {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            // System.out.println("Index: " + i);
            if ((s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') && i<s.length()-1) {
                String temp = s.substring(i, i+2);
                // System.out.println("Temp: " + temp);
                if (temp.equals("IV")) {result+=4; i++;}
                else if (temp.equals("IX")) {result+=9; i++;}
                else if (temp.equals("XL")) {result+=40; i++;}
                else if (temp.equals("XC")) {result+=90; i++;}
                else if (temp.equals("CD")) {result+=400; i++;}
                else if (temp.equals("CM")) {result+=900; i++;}
                else result+=findNumber(s.charAt(i));
            } else {
                result += findNumber(s.charAt(i));
            }
        }
        return result;
    }

    private int findNumber(Character temp) {
        switch (temp){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}