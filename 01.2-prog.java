class Loading2 {
    public static void main(String[] arg) {
        double a, sum = 0;
        int i = 0, n = 10;
        for (i = 1; i <= n; i++) {
            a = (double) 1 / i;
            sum += a;
            System.out.println(a);
        }
        System.out.println(sum);

    }
}
