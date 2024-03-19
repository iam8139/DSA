class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        
        String[] temp = s.split(" ");
        if (pattern.length() != temp.length) return false;

        Set<String> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i = 0; i < temp.length; i++) {
            set1.add(temp[i]);
            set2.add(pattern.charAt(i));
        }
        if (set1.size() != set2.size()) return false;

        Map<Character, String> map = new LinkedHashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                map.put(pattern.charAt(i), temp[i]);
            } else {
                if (!temp[i].equals(map.get(pattern.charAt(i)))) return false;
            }
        }

        return true;
    }
}