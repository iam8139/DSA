class GroupAnagrams {
    private String sorted(String s) {
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            String temp = sorted(word);
            if (!map.containsKey(temp)) {
                List<String> tempList = new ArrayList<>();
                tempList.add(word);
                map.put(temp, new ArrayList);
            } else {
                map.get(temp).add(word);
            }
        }

        return new ArrayList(map.values());
    }

    private boolean equal(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!map1.containsKey(s2.charAt(i))) return false;
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0)+1);
        }

        if (map1.size() != map2.size()) return false;

        for (Character temp : map1.keySet()) {
            if (map1.get(temp) != map2.get(temp)) return false;
        }

        return true;
    }

    private int calHash(String word) {
        String temp = " abcdefghijklmnopqrstuvwxyz";
        int ans = 0;
        for (int i = 0; i < word.length(); i++) {
            ans += temp.indexOf(word.charAt(i));
        }
        return ans;
    }
}