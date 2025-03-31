class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0;i<numRows;i++) {
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j==0 || i==j) {
                    li.add(1);
                }
                else {
                    li.add(res.get(res.size()-1).get(j) + res.get(res.size()-1).get(j-1));
                }
            }Partition Labels
            res.add(li);
        }
        return res;
    }
}