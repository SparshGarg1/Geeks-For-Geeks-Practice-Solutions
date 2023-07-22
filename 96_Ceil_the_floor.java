class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) 
    {
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
        for(int i : arr)
        {
            if(i<=x) floor=Math.max(floor,i);
            if(i>=x) ceil=Math.min(ceil,i);
        }
        if(floor==Integer.MIN_VALUE) return new Pair(-1,ceil);
        if(ceil==Integer.MAX_VALUE) return new Pair(floor,-1);
        return new Pair(floor,ceil);
    }
}

