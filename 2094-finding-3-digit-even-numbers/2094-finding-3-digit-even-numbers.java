import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {

        int[] freq = new int[10];
        for(int d : digits){
            freq[d]++;
        }

        List<Integer> result = new ArrayList<>();

        for(int num = 100; num <= 998; num += 2){ // only even numbers
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            int[] copy = freq.clone();

            if(copy[a]-- > 0 && copy[b]-- > 0 && copy[c]-- > 0){
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            ans[i] = result.get(i);
        }

        return ans;
    }
}