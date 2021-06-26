
public class AVL <E extends Comparable<E>>{
	class Node {

        protected E data;
        protected Node left, right;
        protected int bf;

        public Node(E data) {
            this(data, null, null);
        }

        public Node(E data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
            this.bf = 0;
        }
    }
}
