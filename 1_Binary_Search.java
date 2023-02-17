int binarysearch(int arr[], int n, int k) {

    // code here

    int s =0;

    int e =n-1;

    int mid = (s+e)/2;

    while(s<=e){

      if(arr[mid]==k){

          return mid;

      }

       if(arr[mid]<k){

       s = mid+1;

      }

      else{

             e = mid-1; 

      }

        mid = (s+e)/2; 

    }

    return -1;

}