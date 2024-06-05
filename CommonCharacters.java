class CommonCharacters {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        String temp = words[0];

        for (int i = 1; i < words.length; i++) {
            temp = findCommonWords(temp, words[i]);
        }

        for (int i = 0; i < temp.length(); i++) {
            ans.add(temp.charAt(i)+"");
        }
        return ans;
    }

    private static String findCommonWords(String first, String second) {
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : first.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (Character c : second.toCharArray()) {
            if (map.containsKey(c)) {
                ans.append(c);
                if (map.get(c) > 1) map.put(c, map.get(c)-1);
                else map.remove(c);
            }
        }

        return ans.toString();
    }
}
