/* 假如有一個檔案叫 person.java
 * 正常的執行方式
 * javac person.java
 * java person
 * 
 * 只看執行結果的方式
 * java person.java
 *
*/

/*
 *一個.java檔案中 只能有一個 public 類別
 *當類別為 public 時，類別名需跟檔名相同
 * 
 * JAVA 存取有四種
 *  public, protected, default(不用特別宣告default), private (私人的)
 * 外部類別只能為 public, default
 *
 *  
*/

/*
 *javac person.java (先編譯 class byte-code)
 *java person(執行類別名稱)
 *
 *--------------------------------------------------------
 *
 * java person.java
 *這種執行方式 只會執行最上方的類別，並且不會產生.class 的byte code
 * 
 * 
*/

/*
 *package aa.bb;

 *import java.util.Scanner;

 *public class one{}
 *aa資料夾中的bb資料夾內的One類別
 *
 *!!一定先package 再 import 再 宣告類別
 *
*/
