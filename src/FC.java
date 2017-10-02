public class FC {
    public static void main(String[] args) {
        //顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入攝氏");
        Double c = sc.nextDouble();

        Double f = c * 9 / 5 + 32;
        System.out.println("攝氏:" + c);
        System.out.println("華氏:" + f);
    }
}
