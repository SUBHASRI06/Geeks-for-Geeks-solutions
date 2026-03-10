class Solution {
    public boolean isSubsequence(String s, String t) {
        int ind =0;
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
           if(ind<s.length()&&ch==s.charAt(ind)){
                ind++;
           }
            }
            return ind==s.length();
        }

    }
