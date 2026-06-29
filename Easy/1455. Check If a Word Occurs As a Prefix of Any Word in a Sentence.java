class Solution {
    public int isPrefixOfWord(String s, String word) {
        String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++) {
			String t = arr[i];
			if(t.length()>=word.length()) {
				if(t.equals(word))
					return i+1;
				else if(t.substring(0, word.length()).equals(word))
                    return i+1;
			}
		}
        return -1;
    }
}