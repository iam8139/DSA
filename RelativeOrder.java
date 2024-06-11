class RelativeOrder {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];

        Map<Integer, Integer> map = new HashMap<>();
        for (int temp : arr1) {
            map.put(temp, map.getOrDefault(temp, 0)+1);
        }

        Set<Integer> set1 = map.keySet();
        Set<Integer> set2 = new HashSet<>();

        int j = 0;
        for (int temp : arr2) {
            set2.add(temp);
            for (int i = 0; i < map.get(temp); i++) {
                res[j++] = temp;
            }
        }

        set1.removeAll(set2);
        List<Integer> tempList = new ArrayList();
        tempList.addAll(set1);
        Collections.sort(tempList);
        for (int a : tempList) {
            for (int i = 0; i < map.get(a); i++) {
                res[j++] = a;
            }
        }

        return res;
    }
}
