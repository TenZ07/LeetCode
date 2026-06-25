class Solution {
    public int getLucky(String s, int k) {
        StringBuilder temp = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			temp.append(Integer.toString( ((int) c) -((int) 'a')+1 ));
		}
		for(int i=0;i<k;i++) {
			int t = 0;
			for(char it : temp.toString().toCharArray())
				t+=Character.getNumericValue(it);
			temp.delete(0, temp.length());
			temp.append(Integer.toString(t)); 
		}
        return Integer.parseInt(temp.toString());
    }
}