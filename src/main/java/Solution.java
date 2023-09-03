import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numberOfWays(int startPos, int endPos, int k) {
        Map<String, Integer> memo = new HashMap<>();
        return  dfs(startPos, endPos, k, memo);
    }
    private int dfs(int startPos, int endPos, int k, Map<String, Integer> memo){
        int modulo = 1_000_000_007;
        if(k == 0 && startPos == endPos){
            return 1;
        }
        if(k == 0){
            return 0;
        }
        if(memo.containsKey(startPos + " " + k)){
            return memo.get(startPos + " " + k);
        }
        int result = 0;
        int moveLeft = 0;
        int moveRight = 0;
        if(endPos - startPos < k || startPos > endPos) {
            moveLeft = dfs(startPos - 1, endPos, k - 1, memo) % modulo;
        }
        if(endPos > startPos || startPos - endPos < k) {
            moveRight = dfs(startPos + 1, endPos, k - 1, memo) % modulo;
        }
        result = (moveLeft + moveRight) % modulo;
        memo.put(startPos + " " + k, result);
        return  result;
    }
}