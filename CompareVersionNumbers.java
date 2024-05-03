class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int n = arr1.length > arr2.length ? arr2.length : arr1.length;

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])) return 1;
            if (Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])) return -1;
        }

        if (arr1.length > n) {
            for (int i = n; i < arr1.length; i++) {
                if (Integer.parseInt(arr1[i]) > 0) return 1;
            }
        }

        if (arr2.length > n) {
            for (int i = n; i < arr2.length; i++) {
                if (Integer.parseInt(arr2[i]) > 0) return -1;
            }
        }

        return 0;
    }
}
