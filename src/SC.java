public class SC {
    public static void main(String[] args) {
        //顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int Sum = A + B + C;
        int Sub = (Sum / 3);

        System.out.println(Sum);
        System.out.println(Sub);

    }


    }
