import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe un texto: ");
        String texto = br.readLine().toUpperCase();
        String abc = "ABCDEFGHIJKMNÑOPQRSTUVWXYZ";
        int[] recuento = new int[abc.length()];
        contarletras(texto, abc, recuento);
        visualizarRecuento(abc, recuento);
    }

    private static void visualizarRecuento(String abc, int[] recuento) {
        for (int i = 0; i < recuento.length; i++) {
            if ( recuento[i] > 0 ){
                // System.out.format("d% : d%",abc.charAt(i), recuento[i]);
                System.out.println(abc.charAt(i)+": "+recuento[i]);
            }
        }
    }

    private static void contarletras(String texto, String abc, int[] recuento) {
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            for (int j = 0; j < abc.length(); j++) {
                if (abc.charAt(j) == letra ){
                    recuento[j] += 1;
                }
            }
        }
    }
}