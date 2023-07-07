import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static String INPUT = "C:/Users/Computador/input1,5kk.txt";
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        RedBlackTree redBlackTree = new RedBlackTree();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(INPUT));
            String line;
            while ((line = reader.readLine()) != null) {
                int value = Integer.parseInt(line);

                // Inserindo valores na árvore AVL
                avlTree.insert(value);

                // Inserindo valores na árvore Preto-Vermelho
                redBlackTree.insert(value);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Obtendo a quantidade de rotações e a altura final das árvores
        int avlRotationCount = avlTree.getRotationCount();
        int avlHeight = avlTree.getHeight();

        int redBlackRotationCount = redBlackTree.getRotationCount();
        int redBlackHeight = redBlackTree.getHeight();

        // Exibindo os resultados
        System.out.println("Árvore AVL:");
        System.out.println("Quantidade de rotações: " + avlRotationCount);
        System.out.println("Altura final: " + avlHeight);

        System.out.println("\nÁrvore Preto-Vermelho:");
        System.out.println("Quantidade de rotações: " + redBlackRotationCount);
        System.out.println("Altura final: " + redBlackHeight);
    }
}
