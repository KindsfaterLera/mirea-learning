class Loading3 {
    public static void main(String[] arg) {
        int b[], i = 0, n = 10;
        b = new int[10];
        for (i = 0; i < n; i++) {
            b[i] = (int) (Math.random() * 100);
            System.out.println(b[i]);
        }
        int c;
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (b[j] > b[i]) {
                    c = b[i];
                    b[i] = b[j];
                    b[j] = c;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }
}
