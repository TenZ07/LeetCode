class Solution {
    public boolean isHappy(int n) {
        while(true) {
			int tot = 0;
			while(n!=0) {
				tot += Math.pow(n%10,2);
				n/=10;
			}
			String temp = Integer.toString(tot);
			System.out.println(tot);
			if(tot==1) return true;
            else if(temp.length()==1 && tot!=7) return false;
			n = tot;
		}
    }
}