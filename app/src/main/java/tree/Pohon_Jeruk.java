package tree;

import java.util.ArrayList;
import java.util.List;

public class Pohon_Jeruk<T> {
    private Node<T> root;

    private static class Node<T> {
        T element;
        List<Node<T>> children;

        Node(T element) {
            this.element = element;
            this.children = new ArrayList<>();
        }

        void addChild(Node<T> child) {
            this.children.add(child);
        }
    }

    public Pohon_Jeruk(T dataRoot) {
        this.root = new Node<>(dataRoot);
    }

    public void print_at_depth(int n) {
        if (root == null || n < 0) return;
        
        System.out.println("\n--- Menjalankan DFT untuk Depth: " + n + " ---");
        print_helper(root, 0, n);
        System.out.println();
    }

    private void print_helper(Node<T> node, int currentDepth, int targetDepth) {
        if (node == null) return;

        if (currentDepth == targetDepth) {
            System.out.print(node.element + " ");
            return; 
        }

        for (Node<T> child : node.children) {
            print_helper(child, currentDepth + 1, targetDepth);
        }
    }

    public static void main(String[] args) {
        Pohon_Jeruk<String> pohon = new Pohon_Jeruk<>("A");

        Node<String> b = new Node<>("B");
        Node<String> c = new Node<>("C");
        Node<String> d = new Node<>("D");
        pohon.root.addChild(b);
        pohon.root.addChild(c);
        pohon.root.addChild(d);

        Node<String> e = new Node<>("E");
        Node<String> f = new Node<>("F");
        b.addChild(e);
        b.addChild(f);

        Node<String> h = new Node<>("H");
        c.addChild(h);

        Node<String> k = new Node<>("K");
        Node<String> l = new Node<>("L");
        Node<String> m = new Node<>("M");
        d.addChild(k);
        d.addChild(l);
        d.addChild(m);

        e.addChild(new Node<>("G"));
        h.addChild(new Node<>("I"));
        h.addChild(new Node<>("J"));
        m.addChild(new Node<>("N"));
        
        // Contoh: depth 2
        int parameterUser = 2; 
        pohon.print_at_depth(parameterUser);
        
        // Contoh: depth 3
        pohon.print_at_depth(3);
    }
}