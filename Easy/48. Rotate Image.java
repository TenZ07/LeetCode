class Solution {
    public void rotate(int[][] arr) {
        int temp[][] = new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				temp[j][i] = arr[i][j];
		int c=0;
		for(int i=0;i<arr.length;i++) {
			int r=0;
			for(int j=arr[i].length-1;j>=0;j--) {
				arr[c][r++] = temp[i][j];
				if(r==arr[0].length)
					c++;
			}
		}
    }
}