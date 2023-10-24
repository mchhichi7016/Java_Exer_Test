public class Main {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        int key = 3;
        int cnt = 0;
        for (int i:array) {
            if (i != key){
                continue;
                cnt++;//永远运行不了的代码
            }
        }
        System.out.println(cnt);

    }
}
