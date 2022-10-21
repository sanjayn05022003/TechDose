/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        

        ListNode ptr=head;
        int top=0,right=n-1,bottom=m-1,left=0;
        int flag=0;

        int[][] mat=new int[m][n];
        for(int[] arr:mat){
            Arrays.fill(arr,-1);
        }
        while(top<=bottom && left<=right && ptr!=null){
            if(flag==0){
                int j=left;
                for(;j<=right && ptr!=null;j++){
                    if(ptr!=null){
                        mat[top][j]=ptr.val;
                    }
                      ptr=ptr.next;
                }
               
                top++;
            }
            else if(flag==1){
                int i=top;
                for(;i<=bottom && ptr!=null;i++){
                    if(ptr!=null){
                        mat[i][right]=ptr.val;
                    }
                      ptr=ptr.next;
                }
        
                right--;
            }
            else if(flag==2){
                int j=right;
                for(;j>=left && ptr!=null;j--){
                    if(ptr!=null){
                        mat[bottom][j]=ptr.val;
                    }
                      ptr=ptr.next;
                }
            
                bottom--;
            }
            else if(flag==3){
                int i=bottom;
                for(;i>=top && ptr!=null;i--){
                    if(ptr!=null){
                        mat[i][left]=ptr.val;
                    }
                      ptr=ptr.next;
                }
               
                left++;
            }
            flag=(flag+1)%4;
        }
        return mat;
    }
}
