public class Somatoria {
    public static void main(String[] args) {
        int[]v = {10,4,5,3,2};
        int resultado = somatoria(v, 0);

        System.out.println(resultado);
    }

    private static int somatoria(int[] v, int i) {
        if (i < v.length)
            return v[i] + somatoria(v, i + 1);
        else return 0;
    }
}