class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack=new Stack<>();
        int sqStd=0,circleStd=0;

        for(int i=sandwiches.length-1 ;i>=0; i--){
            stack.push(sandwiches[i]);
            if(students[i]==1){
                sqStd++;
            }else{
                circleStd++;
            }
        }
        while(!stack.isEmpty()){
            int sandwich=stack.pop();

            if(sandwich==0 && circleStd==0){
                return sqStd;
            }
            if(sandwich==1 && sqStd==0){
                return circleStd;
            }
            if(sandwich==1){
                sqStd--;
            }else{
                circleStd--;
            }
        }
        return 0;
    }
}