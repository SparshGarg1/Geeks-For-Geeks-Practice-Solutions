// https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
// Rotate Array by One

class Solution {
    public void rotate(int[] arr) {
        // code here
        int temp=arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
}