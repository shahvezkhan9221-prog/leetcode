class Solution {
    public boolean isGoodArray(int[] arr) {
        int result = arr[0];
          for (int i = 1; i < arr.length; i++) {
            result = findHCF(result, arr[i]);
            
        }
        if (result == 1) {
                return true;
            }
        return false;
    }
        public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
}