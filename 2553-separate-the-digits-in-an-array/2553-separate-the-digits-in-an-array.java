class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            int[] digit = new int[10];
            int idx = 0;

            while (num != 0) {
                digit[idx++] = num % 10;
                num /= 10;
            }

            for (int i = idx - 1; i >= 0; i--) {
                list.add(digit[i]);
            }
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}