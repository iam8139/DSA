class NumberOfRescueBoats {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        int count = 0;
        while ( i <= j) {
            if (people[j] == limit) count++;
            else {
                if (people[j] + people[i] <= limit) i++;
                count++;
            }
            j--;
        }
        return count;
    }
}
