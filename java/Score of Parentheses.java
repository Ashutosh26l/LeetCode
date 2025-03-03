class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st1=new Stack<>();
        int score=0;
        for(int a: s.toCharArray()){
            if(a == '('){
                st1.push(score);
                score=0;
            }
            else{
                score=st1.pop()+Math.max(2*score,1);
            }

        }
        return score;
    }
}