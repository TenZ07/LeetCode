class Solution {
    public int countConsistentStrings(String s, String[] arr) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray())
            set.add(c);
        for(String t : arr) {
            boolean flag = true;
            for(int i=0;i<t.length();i++)
                if(!set.contains(t.charAt(i))) {
                    flag = false;
                    break;
                }
            
            if(flag) count++;
        }
        return count;
    }
}