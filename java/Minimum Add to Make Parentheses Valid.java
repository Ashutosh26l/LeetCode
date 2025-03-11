class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack= new Stack<>();

        int count=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    count++;
                }
                else{
                    stack.pop();
                }
            }
        }
        return count+stack.size();
    }
}