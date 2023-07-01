class Solution{
    
    //binary search
     static int binarySearch(long array[], long element, int low, int high) {

    // Repeat until the pointers low and high meet each other
    while (low <= high) {

      // get index of mid element
      int mid = low + (high - low) / 2;

      // if element to be searched is the mid element
      if (array[mid] == element)
        return mid;

      // if element is less than mid element
      // search only the left side of mid
      if (array[mid] < element)
        low = mid + 1;

      // if element is greater than mid element
      // search only the right side of mid
      else
        high = mid - 1;
    }

    return low-1;
  }
    static int findFloor(long arr[], int n, long x)
    {
        return binarySearch(arr,x,0,n-1);
    }
    
}
