class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        ArrayList<Long> al = new ArrayList<>();
        for(long i : a1)
        {
            al.add(i);
        }
        for(long i: a2)
        {
            if(al.contains(i))
            al.remove(i);
            
            else 
            return "No";
        }
        return "Yes";
    }
}