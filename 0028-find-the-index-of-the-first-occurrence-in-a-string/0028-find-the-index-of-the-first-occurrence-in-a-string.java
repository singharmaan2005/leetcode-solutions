class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.length() == 0) {
            return 0;
        }

        for(int i = 0; i <= haystack.length() - needle.length(); i++) {

            boolean match = false;

            if(needle.charAt(0) == haystack.charAt(i)) {

                match = true;

                for(int j = 0; j < needle.length(); j++) {

                    if(needle.charAt(j) != haystack.charAt(i + j)) {
                        match = false;
                        break;
                    }
                }
            }
            if(match) {
                return i;
            }
        }
        return -1;
    }
}