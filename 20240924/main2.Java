// While 迴圈應用

while (user != answer){
    System.out.print("PLS input number (range " + min + "~" + max + ") :");
    user = input.nextInt();
    if (user >= min && user <= max){
        if (user == answer){
            break;
        }else if (user > answer){
            max = user;
        }else{
            min = user;
        }
    }else{
        System.out.println("out of range!");
    }
}
System.out.println("correct!!");

/*
 * 當user 的值 不等於 answer 時
 * 將會執行while 迴圈
 * 只有遇到break時 才能跳出迴圈
*/

//import java.util.Ramdom
//會產生隨機亂數
/* random.nextInt(99) + 1
 *(99)代表範圍 => 0 ~ 98
 * +1 是讓範圍內的數字+1
 * 這樣就等於範圍 => 1 ~ 99
*/
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args){
        int min = 1;
        int max = 100;
        Random random = new Random();
        int answer = random.nextInt(99)+1;
        //System.out.println("ans : " + answer);
        int user  = 0;
        Scanner input = new Scanner(System.in);
        
        while (user != answer){
            System.out.print("PLS input number (range " + min + "~" + max + ") :");
            user = input.nextInt();
            if (user >= min && user <= max){
                if (user == answer){
                    break;
                }else if (user > answer){
                    max = user;
                }else{
                    min = user;
                }
            }else{
                System.out.println("out of range!");
            }
        }
        System.out.println("correct!!");
    }
}

//do while 用法

/*
 *會先做do 裡面的程式
 *在做while內的判斷
 *若條件=while的內容 則回到do裡面
 *只有不等於時才跳出do while 迴圈
*/

do{
    min = 1;
    max = 100;
    answer = random.nextInt(99)+1;
    //System.out.println("ans : " + answer);
    int user  = 0;
    Scanner input = new Scanner(System.in);

    while (user != answer){
        System.out.print("PLS input number (range " + min + "~" + max + ") :");
        user = input.nextInt();
        if (user >= min && user <= max){
            if (user == answer){
                break;
            }else if (user > answer){
                max = user;
            }else{
                min = user;
            }
        }else{
            System.out.println("out of range!");
        }
    }
    System.out.println("correct!!");
    System.out.print("play Again pls input  0  :");
    playagain = input.nextInt();
}while( playagain == 0 );

//for 迴圈用法
// for ( 宣告變數 ; 判斷 ; 改變變數)

public class Nine {
    public static void main(String[ ] args){
        for (int i = 2 ; i < 9 ; i ++){
            System.out.println(" ");
            for (int j = 2 ; j < 9 ; j ++){
                System.out.println(i+ " X " +j+ " = " +( i * j) );
            }
        }
    }
}