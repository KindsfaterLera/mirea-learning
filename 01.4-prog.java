import java.util.Scanner;
class Loading4 {
    public static void main(String[] arg) {
        Scanner d = new Scanner (System.in);
        int dd = d.nextInt();
        int e = 1, i = 0, n = 10;
        for (i = 1; i <= dd; i++){
            e = e * i;
        }
        System.out.println(e);
    }
}
