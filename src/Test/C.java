package Test;
/*
*
*   大位置相乘算法
* */
import java.util.Arrays;

public class C {
    public static void main(String[] args) {
        int[] arr1={1,0,0,0};
        int[] arr2={2,0,0,0};
        int[] arr=new int[(arr1.length+arr2.length)];

        //两个数组相乘，各求和
        /*
        *       1       2
        *       2       3
        *--------------------
        *       3        6
        *   2   4
        *  ----------------
        *  2    7       6
        *
        * */
        for (int i = 0; i <arr1.length; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                    if (i!=j){
                        arr[i+j]+=arr1[i]*arr2[j];
                    }else {
                        arr[i+j]=arr1[i]*arr2[j];
                    }
            }
        }
        //遍历结果数组
        for (int i = 0; i <arr.length-1 ; i++) {
            int temp=arr[i];
            arr[i]=(temp%10);
            arr[i+1]+=(temp/10);
        }
        System.out.println(arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
