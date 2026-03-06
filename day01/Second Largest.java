class Solution {
    public int getSecondLargest(int[] arr) {
       if(arr.length<=1) return -1;
       int first = -1;
       int sec = -1;
       for(int i=0;i<arr.length;i++){
           if(first<arr[i]){
               sec = first;
               first = arr[i];
               
           }if(first>arr[i]&&arr[i]>sec){
               sec = arr[i];
           }
       }
       return sec;
        
    }
}