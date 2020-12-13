package test1;

public class demo01{
    public static void main(String[] args) {
        int []array={50,4,6,68,48};
        int max=getMax(array);
        System.out.println("最大值："+max);
    }
    public static int getMax(int[]array){
        int max=array[0];
        for (int i = 1; i <array.length ; i++) {
            if (array[i]>max){
                max = array[i];
    }
}return max;
}}
