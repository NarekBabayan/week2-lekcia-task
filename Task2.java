public class Task2 {
    public static void main(String[] args){
        int a=1, b=1,c;
        int[] fibonachi  = new int[10];
        fibonachi[0]=1;

        for(int i=1;i<=9;i++){
            c=a+b;
            a=b;
            b=c;
            fibonachi[i]=a;
        }

        int[] fib2 = new int[10];
        int index = 0;

        for(int i = fibonachi.length-1; i>=0;i--){
            fib2[index] = fibonachi[i];
            index++;
        }

        for(int i=0;i<=9;i++){
            System.out.println(fib2[i]);
        }

    }
}
