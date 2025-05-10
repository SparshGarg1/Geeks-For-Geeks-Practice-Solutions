Move All Zeroes to End
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j=0;
        int temp=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0 && arr[j]==0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
            
        }
    }
}