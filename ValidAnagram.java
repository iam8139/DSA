class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        Arrays.sort(arrayS);
        Arrays.sort(arrayT);
        for (int i = 0; i < arrayS.length; i++) {
            if (arrayS[i] != arrayT[i]) return false;
        }

        return true;

        // Map<Character, Integer> map1 = new HashMap<>();
        // Map<Character, Integer> map2 = new HashMap<>();

        // for (int i = 0; i < s.length(); i++) {
        //     if (!map1.containsKey(s.charAt(i))) {
        //         map1.put(s.charAt(i), 1);
        //     } else {
        //         map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
        //     }

        //     if (!map2.containsKey(t.charAt(i))) {
        //         map2.put(t.charAt(i), 1);
        //     } else {
        //         map2.put(t.charAt(i), map2.get(t.charAt(i))+1);
        //     }
        // }

        // for (Map.Entry node: map1.entrySet()) {
        //     if (!node.getValue().equals(map2.get(node.getKey()))) return false;
        // }

        // return true;
    }
}