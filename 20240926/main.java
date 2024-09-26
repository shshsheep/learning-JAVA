//break 的相關用法


//break 原本只會跳脫出原本的迴圈
//設定跳脫點，就可指定跳脫到哪個部分


public class Nine {
    public static void main(String[ ] args){
        out : {
        for (int i = 2 ; i <= 9 ; i ++){
            System.out.println(" ");
            for (int j = 2 ; j <= 9 ; j ++){
                if (i * j > 50){
                    break out;
                  }
                System.out.println(i+ " X " +j+ " = " +( i * j) );
              }
           }
        }
    }
}

//break 直接跳出out內的所有程式

//實作

//計算正n邊形的內 外角和
import java.util.Scanner;
public class poly {
    public static void main(String[ ] args){
        Scanner input = new Scanner(System.in);
        System.out.print("input your sides : ");
        int n = input.nextInt( );
        if (n>2){
            System.out.println("sum of  inner angle :" + (n-2) * 180.0 );
            System.out.println("inner angle :" + (n-2) * 180.0 /n);
            System.out.println("outer angle :" + 360.0);
            System.out.println("sum of outer angle :" + 360.0/n);
        }else{
            System.out.println("error pls input less 3 sides!!");
        }
    }  
}

//費波那契數
//最大n值只能到46 over答案會變負數
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[ ] args){
         Scanner input = new Scanner(System.in);
         System.out.print(" pls input n :");
         int n = input.nextInt( );
         if(n >= 0){
            int a = 0;
            int b = 1;
            int res = 0;
            for(int i = 0; i <= n ; i++){
                if ( i == 0){
                    System.out.println(" f(0) = " + 0);
                }else if( i == 1 ){
                    System.out.println(" f(1) = " + 1);
                }else{
                    res = a + b ;
                    System.out.println(" f( " + i + " ) = " +res);
                    a = b;
                    b = res;
                }
            }
        }else{
            System.out.println("error pls input correct number!!");
        }
    }
}

//最大公因數 and 最小公倍數

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[ ] args){
    Scanner input = new Scanner(System.in);
    System.out.print(" pls input first number :");
    int a = input.nextInt();
    System.out.print(" pls input sec number :");
    int b = input.nextInt();
    if (a > 0 && b > 0 ){
        if (a > b) { 
            int temp = a ; //確保a得值比b小 
            a = b ;        //若比較大 則a 的值與b 交換
            b = temp ;
        }
        int hcf = -1;
        for (int i = a; i > 1; i --){
            if (a%i == 0 && b%i == 0){
                hcf = i;
                break;
            }
        }
        if(hcf < 0) {
            System.out.println(" error hcf !!");
        }else{
            System.out.println("hcf : " + hcf);
        }
        int lcm = -1;
        for(int i= b ; i <= a*b; i++){
            if (i % a == 0 && i%b == 0){
                lcm = i;
                break;
            }
        }
        System.out.println("lcm :" + lcm );
    }else{
        System.out.println("error pls input correct number!!");
    }
    }
}
