tion for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque< Guide> path = new ArrayDeque();
        path.addFirst(new Guide(0, root));
        
        while(!path.isEmpty()) {
            Guide current = path.removeFirst();
            if (current.node == null) continue; //defensive
            
            if (current.ope == 1) {
                result.add(current.node.val);
            } else {
                path.addFirst(new Guide(1, current.node));
                path.addFirst(new Guide(0, current.node.right));
                path.addFirst(new Guide(0, current.node.left));
            }
        }
        
        return result;
    }
    
    private class Guide {
        int ope; // 0 : visit, 1: print
        TreeNode node;
        public Guide(int ope, TreeNode node) {
            this.ope = ope;
            this.node = node;
        }
    }
}
