class Solution {
    int MissingNumber(int array[], int n) {
        Arrays.sort(array);
        for (int i = 0; i < n - 1; i++)

            if (array[i] != i + 1){

                return i + 1;

            }

        return n;// if n = 2 and array[] = {1}  (returning last element equal to size which can't be checked in loop.)
    }
}