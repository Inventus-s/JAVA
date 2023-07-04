import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Question4 {
    public static TreeNode str2tree(String s) {
        if (s.isEmpty()) {
            return null;
        }

        int i = 0;
        StringBuilder numStr = new StringBuilder();

        while (i < s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i) == '-')) {
            numStr.append(s.charAt(i));
            i++;
        }

        TreeNode root = new TreeNode(Integer.parseInt(numStr.toString()));
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                i++;
                numStr = new StringBuilder();

                while (i < s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i) == '-')) {
                    numStr.append(s.charAt(i));
                    i++;
                }

                TreeNode child = new TreeNode(Integer.parseInt(numStr.toString()));

                TreeNode parent = stack.peek();
                if (parent.left == null) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }

                stack.push(child);
            } else if (s.charAt(i) == ')') {
                stack.pop();
                i++;
            }
        }

        return root;
    }

    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        String s = "4(2(3)(1))(6(5))";
        TreeNode root = str2tree(s);

        System.out.print("Inorder Traversal: ");
        inorderTraversal(root);
    }
}
