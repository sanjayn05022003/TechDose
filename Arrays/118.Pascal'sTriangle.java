class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<List<Integer>>();
        
        if(numRows==0){
            return triangle;
        }
        
        List<Integer>first=new ArrayList<Integer>();
        first.add(1);
        triangle.add(first);
        
        for(int i=1;i<numRows;i++){
            List<Integer>prev=triangle.get(i-1);
            List<Integer>current=new ArrayList<Integer>();
            
            current.add(1);
            for(int j=1;j<i;j++){
                current.add(prev.get(j-1)+prev.get(j));
            }
            
            current.add(1);
            triangle.add(current);
        }
        return triangle;
    }
}
