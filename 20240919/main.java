//學習運算
//BMI計算機

/**
 *
 * @author student
 */
public class BMI {
    public static void main(String[] args){
        double height = 162;
        double weight = 50;
        double bmi = weight/(height*height/10000);
        String name = "JHYang";
        System.out.println(name + "\t" + bmi);
                
    }
    
// run-single = JHYang	19.051973784484073

// "\t" 跳脫指令

//遞增 ++ , -- 
/*
 * ++變數 : 先加後用
 * 變數++ : 先用後加
 * --變數 : 先減後用
 * 變數-- : 先用後減
*/

//建立使用者輸入
// 'java.util.Scanner'
/*
 * import java.util.Scanner
 * 
 * Scanner 變數名稱 = new Scanner(System.in);
*/


public class BMI {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Pls input your height:");
        double height = scanner.nextDouble(); //使用者輸入的值會轉成Double 函數
        System.out.print("Pls input your weight:");
        double weight = scanner.nextDouble(); //使用者輸入的值會轉成Double 函數
        double bmi = weight/(height*height/10000);
        System.out.print("Pls input your name:"); 
        String name = scanner.next(); //使用者輸入的值為一般字串 String
        System.out.println(name + "\t" + bmi);
                
    }
}

// if ,else if 判斷式

import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls input your height:");
        double height = scanner.nextDouble();
        System.out.print("Pls input your weight:");
        double weight = scanner.nextDouble();
        System.out.print("Pls input your name:");
        String name = scanner.next();
        if (height > 0 && weight > 0 ){
            double bmi = weight/(height*height/10000);
            System.out.println(name + "\t" + bmi);
            if (bmi < 18.5){
                System.out.println("weight too low");
            }else if (bmi < 24){
                System.out.print("avage weight");
            }else if (bmi > 24){
                System.out.print("weight too high");    
            }
        }else{
            System.out.println("error");
        }
    }
    
}


