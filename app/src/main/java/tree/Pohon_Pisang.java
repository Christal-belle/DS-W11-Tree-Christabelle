package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Pohon_Pisang {

    static Map<String, List<String>> tree = new HashMap<>();

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah node: ");
            if (!input.hasNextInt()) return;
            int jumlahNode = input.nextInt();

            HashSet<String> semuaAnak = new HashSet<>();
            HashSet<String> semuaNode = new HashSet<>();

            System.out.println("Masukkan " + (jumlahNode - 1) + " baris pasangan (contoh: A B):");

            for (int i = 0; i < jumlahNode - 1; i++) {
                if (input.hasNext()) {
                    String parent = input.next();
                    String child = input.next();

                    tree.putIfAbsent(parent, new ArrayList<>());
                    tree.get(parent).add(child);

                    semuaAnak.add(child);
                    semuaNode.add(parent);
                    semuaNode.add(child);
                }
            }

            String root = null;
            for (String node : semuaNode) {
                if (!semuaAnak.contains(node)) {
                    root = node;
                    break;
                }
            }

            System.out.print("Leaf nodes (kiri ke kanan): ");
            if (root != null) {
                printLeaves(root);
            } else if (!semuaNode.isEmpty()) {
                printLeaves(semuaNode.iterator().next());
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    static void printLeaves(String node) {
        if (tree.containsKey(node) && !tree.get(node).isEmpty()) {
            for (String child : tree.get(node)) {
                printLeaves(child);
            }
        } else {
            System.out.print(node + " ");
        }
    }
}