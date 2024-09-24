//學習 switch 用法 

/*
 * if : 範圍比較
 * case : 精準比較
*/

Scanner input = new Scanner(System.in);
int score = input.nextInt();

/* 
 * input 為函式名稱
 * 呼叫Scanner 可以直接用函式(input)呼叫
 * 
 * 
*/

import java.util.Scanner;
public class Score {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("input your Score : ");
        int score = input.nextInt();
        if (score >= 0 && score <=100){
            int level = score / 10;
            switch(level){
                case 10 :
                    System.out.println("S Rank :" + score);
                    break;
                case 9 :
                    System.out.println("A Rank :" + score);
                    break;
                case 8 :
                    System.out.println("B Rank :" + score);
                    break;
                case 7 :
                    System.out.println("C Rank :" + score);
                    break;
                case 6 :
                    System.out.println("D Rank :" + score);
                    break;
                default :
                    System.out.println("F Rank :" + score);
                    break;
            }
        }else{
            System.out.println("error number :" + score);
        }
    }
}
