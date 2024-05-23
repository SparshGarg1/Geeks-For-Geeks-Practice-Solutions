class Solution {
    public static boolean isPerfect(int n, int[] arr) {
        // code here
        int arr1[] = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            arr1[i]=arr[arr.length-i-1];
        }
        return java.util.Arrays.equals(arr,arr1);
    }
}
        
