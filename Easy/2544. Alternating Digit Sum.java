class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int res=Integer.parseInt(String.valueOf(s.charAt(0)));
		for(int i=1;i<s.length();i++) {
			int t = Integer.parseInt(String.valueOf(s.charAt(i)));
			if(i%2==1)
				res-=t;
			else
				res+=t;
		}
        return res;
    }
}