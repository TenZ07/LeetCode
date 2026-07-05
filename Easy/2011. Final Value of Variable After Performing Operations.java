class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int x=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i].charAt(1)=='-')
                --x;
            else
                ++x;
        return x;
    }
}