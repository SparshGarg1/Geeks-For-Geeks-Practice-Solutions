class Solution {
    static long gcd(long a, long b){
      if(a==0) return b;
      return gcd(b%a,a);
      
  }
  static Long[] lcmAndGcd(Long A , Long B) 
  {
      // Since A * B = gcd(A,B)*LCM(A,B)
      Long arr[]= new Long[2];
      arr[0]=(A*B)/gcd(A,B);
      arr[1]=gcd(A,B);
      return arr;
  }
};