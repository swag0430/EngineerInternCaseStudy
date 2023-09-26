/// Algorithms Q
public class Node{
    public int key;
    public Object data;
    public Node left;
    public Node right;

    /// A
    public static Object searchTree(Node root, int key) {
        while (root != null) {
            if (key == root.key) {
                return root.data;
            } else if (key < root.key) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return null;
    }

    /// B
    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }
        
        Node mirroredLeft = mirror(root.left);
        Node mirroredRight = mirror(root.right);
        
        // Swap the left and right subtrees
        root.left = mirroredRight;
        root.right = mirroredLeft;
        
        return root;
    }
}

    /// C
    /*
        The running time of mirror() method implemented using recursion is O(n) which n = number of nodes in the binary tree
        Explain:
            The method visits each node in the binary tree exactly once.
            For each node, the method performs constant time operations, such as swapping the left and right subtrees.
            Therefore, the time complexity of the mirror() method is proportional to the number of nodes in the tree, resulting in a linear time complexity of O(n).
    */

    /// D
    /*
        The following data structures is the most efficient one to use for this task?
        A. A sorted array
    */

/// SQL Q

    /// 1
    /*
        SELECT *
        FROM Student
        WHERE Stu_Age = 20;
    */
    /// 2
    /* 
        SELECT MAX(Stu_Marks) AS Second_highest_marks
        FROM Student
        WHERE Stu_Marks < (SELECT MAX(Stu_Marks) FROM Student); 
    */
    /// 3
    /*
        SELECT *
        FROM Student
        WHERE Stu_Name LIKE 'R%';
    */
    /// 4
    /*
        SELECT Stu_Marks
        FROM Student
        ORDER BY Stu_Marks ASC
        LIMIT 3;
    */

/// Java Q&A
    /*
        1. C
        2. D
        3. B
        4. B
        5. B
        6. A
        7. B
        8. B,D,E
        9. E
        10. C
    */