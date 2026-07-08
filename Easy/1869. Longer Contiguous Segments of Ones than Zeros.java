class Solution {
    public boolean checkZeroOnes(String n) {
        int max1 = 0,max0 = 0;
		for(int i=0;i<n.length();i++) {
			int c = 0;
			for(int j=i;j<n.length();j++)
				if(n.charAt(j)=='1')
					c++;
				else
					break;
			max1 = Math.max(max1, c);
		}
		for(int i=0;i<n.length();i++) {
			int c = 0;
			for(int j=i;j<n.length();j++)
				if(n.charAt(j)=='0')
					c++;
				else
					break;
			max0 = Math.max(max0, c);
		}
        return max1>max0;
    }
}