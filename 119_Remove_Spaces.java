class Solution
{
   
    String modify(String S)
    {
        // your code here
       StringBuilder s1 = new StringBuilder();
        for(int i = 0; i < S.length(); i++)
        {
            if(S.charAt(i) != ' ')
                s1.append(S.charAt(i));
        }
        return s1.toString();
    }
}