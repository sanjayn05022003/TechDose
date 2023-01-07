/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    public void dfs(Node node, Node head, Node[] visited){

        visited[head.val]=head;

        for(Node i:node.neighbors){

            if(visited[i.val]==null){
                Node nn=new Node(i.val);

                head.neighbors.add(nn);
                dfs(i, nn, visited);
            }
            else{
                head.neighbors.add(visited[i.val]);
            }
        }
    }
    public Node cloneGraph(Node node) {
        
        if(node ==null){
            return null;
        }
        Node head=new Node(node.val);
        Node[] visited=new Node[101];
        Arrays.fill(visited,null);

        dfs(node, head, visited);

        return head;
    }
}
