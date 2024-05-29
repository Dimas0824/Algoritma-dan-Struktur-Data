package pertemuan14.Praktikum1;

public class BinaryTree20 {
    Node20 root;

    public BinaryTree20() {
        root = null;
    }

    boolean isEmpty() {
        return root == null; // kosong jika root == null
    }

    void add(int data) { // merubah logika pada bagian else agar langsung memanggil method tambahRekursif
        if (isEmpty()) {
            root = new Node20(null, data, null);
        } else {
            tambahRekursif(root, data);
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node20 current = root;
        while (current != null) { // lanjut looping jika data != nulll
            if (current.data == data) { // cek current data = data
                result = true;
                break;
            } else if (data < current.data) { // jika data lebih kecil maka ke anak kiri
                current = current.left;
            } else {
                current = current.right; // jika data lbih besar maka ke anak kanan
            }
        }
        return result;
    }

    void traversePreOrder(Node20 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node20 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node20 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node20 getSuccessor(Node20 del) {
        Node20 successor = del.right;
        Node20 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        // find node (current) that will be deleted
        Node20 parent = root;
        Node20 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // deletion
        if (current == null) {
            System.out.println("Could not find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            } else if (current.right == null) { // if there is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // if there is 2 childs
                Node20 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    void tambahRekursif(Node20 current, int data) { // tambahan method tambah secara rekursif
        if (current == null) {
            current = new Node20(null, data, null);
        } else {
            if (data < current.data) {
                if (current.left != null) {
                    tambahRekursif(current.left, data);
                } else {
                    current.left = new Node20(null, data, null);
                }
            } else if (data > current.data) {
                if (current.right != null) {
                    tambahRekursif(current.right, data);
                } else {
                    current.right = new Node20(null, data, null);
                }
            }
        }
    }

    int findMin() {
        Node20 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    int findMax() {
        Node20 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    void tampilLeaf(Node20 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            } else {
                tampilLeaf(node.left);
                tampilLeaf(node.right);
            }
        }
    }

    int tampilJumlahLeaf(Node20 node) {
        if (node == null) {
            return 0;
        } else if (node.left == null && node.right == null) {
            System.out.println(" " + node.data);
            return 1;
        } else {
            return tampilJumlahLeaf(node.left) + tampilJumlahLeaf(node.right);
        }
    }
}