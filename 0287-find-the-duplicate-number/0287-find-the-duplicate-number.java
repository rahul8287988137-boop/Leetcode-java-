class Solution {
    void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int findDuplicate(int[] arr) {
        int i = 0;
        int n = arr.length;
        while(i<n){
            if(arr[i] == i+1|| arr[i] == arr[arr[i]-1]){
                i++;
            }
            else{
                swap(arr,i,arr[i]-1);
            }
        }
        for(i = 0 ; i < n ; i++){
            if(arr[i] !=i+1){
                return arr[i];
            }
        }
         return n;
    }
}