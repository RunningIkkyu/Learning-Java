import java.util.Scanner;  // Import the Scanner class

public class ArrayInit {
    public static void main(String[] args) {
        // 动态初始化1，3 行 5 列，全部初始化为 0。
        int a[][] = new int[3][5];

        // 输出该二维数组，未初始化部分显示 null。
        System.out.println("数组 a 的初始化语句为：int a[][] = new int[3][5];"); 
        System.out.println("数组 a 的内容为："); 
        for(int i = 0;i < 3;i++) {
            for(int j = 0;j <= 7;j++) {
                try{
                    System.out.print(a[i][j] + "\t");
                } catch (Exception e){
                    System.out.print("null\t");
                }
            }
            System.out.println();
        }

        // 动态初始化2
        int b[][] = new int[3][];
        b[0] = new int[2];
        b[1] = new int[]{1,2,3};
        b[2] = new int[]{4,5,6,7,8,9};

        // 访问未初始化部分会抛出空指针异常：java.lang.ArrayIndexOutOfBoundsException
        // System.out.println(b[0][2]); 
        
        // 输出该二维数组，未初始化部分显示 null。
        System.out.println("数组 b 的内容为："); 
        for(int i = 0;i < 3;i++) {
            for(int j = 0;j <= 7;j++) {
                try{
                    System.out.print(b[i][j] + "\t");
                } catch (Exception e){
                    System.out.print("null\t");
                }
            }
            System.out.println();
        }
        
    }
}

