public class gugudanSub {
    int m;
    public gugudanSub(int num){
        m = num;
    }
    public int[] calculate(int n) {
        int[] result = new int[m];
        for (int i = 1; i < this.m + 1; i++) {
            result[i-1] = n * i;
        }
        return result;
    }
    public static void print_result(int[] result){
        for (int i = 0; i < result.length; i++){
            System.out.printf("%d * %d = %d\n",result[0], i + 1, result[i]);
        }
    }
}