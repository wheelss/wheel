public class su {
    public static void main(String[] args) {
        //写出打印101-200只有的所有素数，并求出所素数的和的代码。
        int sum = 0;
        for (int i = 101; i < 200; i++) {
            boolean b = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
            if (b == true) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.print("和为:" + sum);
    }
}
