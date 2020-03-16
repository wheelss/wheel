public class Sum {
    public static void main(String[] args){
        //写出计算1+2+3+···+100的和的代码。
        int sum=0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
