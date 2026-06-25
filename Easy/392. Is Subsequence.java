class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] ch = t.toCharArray();
		 int arr[] = new int[s.length()];
	        boolean res = true;
            int start = 0;
	        for(int i=0;i<s.length();i++) {
	        	int j=0;
                boolean found = false;
	        	for(j=start;j<ch.length;j++)
	        		if(s.charAt(i)==ch[j]) {
	        			arr[i] = j;
	        			ch[j] = '\u0000';
                        start = j+1;
                        found = true;
	        			break;
	        		}
                if(!found) return false;
	        }
	        for(int i=1;i<arr.length;i++)
	        	if(arr[i]<=arr[i-1])
	        		res = false;
        return res;
    }
}