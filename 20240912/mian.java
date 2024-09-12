//開啟netbeam 左上角 file create new project

//file-Java  project-Java application
// Active (twice) 


//左邊projects-source package/default package右鍵 create java-class

public class hellojava {
    public static void main(String[] args){
        System.out.println("hello ! Java");
    }
}

//shift+F6 run project

//在CMD內 javac hellojava.java
//將產生hellojava.class
//在cCMD內 java hellojava 
//就能夠執行程式了!!


//編譯的原始碼*.java轉換成中介碼*.class
//.class 有如客戶端 


//ctrl+/ 一鍵註解

//當字串數字超過10位 後面必須加(L)

/**
 * 2024/09/12
 * @author JHYANG
 */
public class hellojava { //名稱必須與檔案名稱相同
    public static void main(String[] args){ //程式進入點
        System.out.println("hello ! Java"); //列印後換行
        System.out.println(12345678900L);
    }
}
