import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class trab {
    public static String[][] leMapa(String [][] mapa, int i, int j) throws Exception {
        String [][] path = /*"INSIRA O CAMINHO DO MAP "*/;
        FileReader teste = new FileReader(path);
        char[] buffer = new char[1000];
        teste.read(buffer);
        String text = new String(buffer);
        System.out.println("Mapa lido");
        teste.close();
        return text;
    }

    public static void printaMapa(String[][] mapa) throws Exception {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void verificaS(String[][] mapa) throws Exception {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa.length; j++) {
                if ((mapa[i][j] == "S") || (mapa[i][j] == "s")) {
                    System.out.println("Posição inicial: [" + i + "," + j + "]");
                }
            }
        }
    }

    public static void andar(String[][] mapa, int i, int j, char move) throws Exception {
        if ((mapa[i][j] == "x") || (mapa[i][j] == "X")) {
            System.out.println("Cant move");
        } else if ((mapa[i][j] == "E") || (mapa[i][j] == "e")) {
            System.out.println("End!");
        } else {
            System.out.println("Can move!");
            if ((move == 'e') || (move == 'E')) {
                j--;
            }
            if ((move == 'd') || (move == 'D')) {
                j++;
            }
            if ((move == 'c') || (move == 'C')) {
                i--;
            }
            if ((move == 'b') || (move == 'B')) {
                i++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int i = 0;
        int j = 0;
        char move;
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Instruções\nPosição inicial: S\nPosição final: E\nAndar:\nE: esquerda\nD: direita\nC: cima\nB: baixo"); 
        String [][] mapa = leMapa();
        System.out.println(leMapa());
        System.out.println("Digite para onde andar:");
        move = sc.next().charAt(0);
        andar()
        sc.close();
    }
}
