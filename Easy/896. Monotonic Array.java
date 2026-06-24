class Solution {
    public boolean isMonotonic(int[] arr) {
        boolean flag = false;
		if(flag==false) {
			int t =0;
			for(int i=1;i<arr.length;i++) {
				if(arr[i-1]<=arr[i])
					t++;
				else
					break;
			}
			if(t==arr.length-1)
				flag = true;
                if(flag)
                    return flag;
		}
		if(flag==false) {
			int t =0;
			for(int i=1;i<arr.length;i++) {
				if(arr[i-1]>=arr[i])
					t++;
				else
					break;
			}
			if(t==arr.length-1)
				flag = true;
                if(flag)
                    return flag;
		}
        return false;
    }
}