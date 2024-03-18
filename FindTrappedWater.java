class FindTrappedWater {

    public int trap(int[] height) {
        int start = 0; int end = 0; int startH = height[0]; int water = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] >= startH) {
                end = i;
                water += calWater(height, start, end);

                start = i;
                startH = height[i];
            } else {
                end++;
            }
        }

        if (start < end) {
            int[] tempArr = new int[end-start+1];
            int j = 0;
            for (int i = end; i >= start; i--) {
                tempArr[j] = height[i];
                j++;
            }

            int tempS = 0; int tempE = 0; int tempSH = tempArr[0];

            for (int k = 1; k < tempArr.length; k++) {
                if (tempArr[k] >= tempSH) {
                    tempE = k;
                    water += calWater(tempArr, tempS, tempE);

                    tempS = k;
                    tempSH = tempArr[k];
                } else {
                    tempE++;
                }
            }
        }

        return water;
    }

    private int calWater(int[] height, int start, int end) {
        int temp = 0;
        int min = Math.min(height[start], height[end]);
        for (int i = start; i < end; i++) {
            temp += min - height[i];
        }
        // System.out.println("water between start: %s and end: %s is: %s".formatted(start, end, temp));
        return temp;
    }
}