class Solution {
    String removeDups(String S) 
    {
        // code here
        String a = "";
        for(int i=0; i<S.length();  i++)
        {
            if(!a.contains(S.charAt(i)+""))
            a=a + S.charAt(i);
        }
        return a;
    }
}