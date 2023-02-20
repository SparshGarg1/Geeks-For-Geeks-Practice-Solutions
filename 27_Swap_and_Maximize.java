class GFG
{
    long maxSum(long arr[] ,int n)
    {
        Arrays.sort(arr);
        int sum=0;
        int i = 0;
        int j = n-1;
        while(i < j) {
            sum += Math.abs(arr[i] - arr[j]);
            sum += Math.abs(arr[i + 1] - arr[j]);
            i++;
            j--;
        }
        sum += Math.abs(arr[0] - arr[i]);
        return sum;
    }
}