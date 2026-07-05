class Solution {
    public String[] findWords(String[] arr) {
        String[] row = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        ArrayList<String> res = new ArrayList<>();
        for(String temp : arr) {
            int c=0;
            String t = temp.toLowerCase();
            for(int i=0;i<t.length();i++) {
                if(row[0].indexOf(t.charAt(i))==-1) {
                    c=0;
                    break;
                }else
                    c++;
            }
            if(c!=t.length()) {
            for(int i=0;i<t.length();i++) {
                if(row[1].indexOf(t.charAt(i))==-1) {
                    c=0;
                    break;
                }else
                    c++;
            }
            }
            if(c!=t.length()) {
            for(int i=0;i<t.length();i++) {
                if(row[2].indexOf(t.charAt(i))==-1) {
                    c=0;
                    break;
                }else
                    c++;
            }
            }
            if(c==t.length())
                res.add(temp);
        }
        String[] result = new String[res.size()];
        for(int i=0;i<res.size();i++)
            result[i] = res.get(i);
       return result;
    }
}