class Solution {
    static long solve(int N, int K, ArrayList<Long> al) {
        long sum=0;
        for(long i : al)
        {
            sum += i;
        }
        for(int i=K; i<N; i++)
        {
            al.add(sum);
            sum=sum+al.get(i)-al.get(i-K);
        }
        return al.get(N-1);
    }
}