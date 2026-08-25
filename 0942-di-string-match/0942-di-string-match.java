class Solution {
    public int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int leftPointer = 0;
        int rightPointer = s.length();
        int index = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I')result[index++] = leftPointer++;
            else result[index++] = rightPointer--;
        }

        if(s.charAt(s.length() - 1) == 'I') result[index] = leftPointer;
        else result[index] = rightPointer;
        
        return result;
    }
}