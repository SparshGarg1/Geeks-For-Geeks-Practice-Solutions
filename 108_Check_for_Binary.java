class GfG
{
	boolean isBinary(String s)
	{
	  //Your code here
	  for(int i=0; i<s.length(); i++)
	  {
	      if(s.charAt(i)!='0' && s.charAt(i)!='1')
	      {
	          return false;
	      }
	  }
	  return true;
	}
}