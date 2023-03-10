public class EncontreEspecifico {

    public static boolean encontrar(int x[], int tam, int termo) {
        if (tam == 0) {
            return false;
        } else {
            if (x[tam - 1] == termo) {
                return true;
            } else {
                tam = tam - 1;
                return encontrar(x, tam, termo);
            }
        }
    }

    public static void main(String[] args) {
        int tam = 5, termo = 10;

        int[] x = new int[tam];

        x[0] = 10;
        x[1] = 3;
        x[2] = 7;
        x[3] = 1;
        x[4] = -2;

        System.out.println("Array: " + x[0] + " " + x[1] + " " + x[2] + " " + x[3] + " " + x[4]);
        System.out.println("Termo procurado: " + termo);

        System.out.println(" ");

        if (encontrar(x, tam, termo) == true) {
            System.out.println("O valor buscado está no array");
        } else {
            System.out.println("O valor buscado nao está no array");
        }
    }
}