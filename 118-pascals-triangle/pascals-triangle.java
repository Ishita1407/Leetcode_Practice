class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            List<Integer> newRow=generateRow(i);
            ans.add(newRow);
        }
        return ans;
    }
    static List<Integer> generateRow(int numRow)
    {
        List<Integer> row=new ArrayList<>();
        int ans=1;
        row.add(ans);
        for(int i=1;i<numRow;i++)
        {
            ans=ans*(numRow-i);
            ans=ans/i;
            row.add(ans);
        }
        return row;
    }
}