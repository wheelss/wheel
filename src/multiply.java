public class multiply {
    public static void main(String[] args) {
        //写出在控制台打印九九乘法表的代码。
        for(int i = 1; i < 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " * " + i + " = " + (j * i) + "  ");

            }
            System.out.println();
        }
    }
}
