package Sample;

public class IfSample {

//    public static void main(String[] args) {
//        // TODO 自動生成されたメソッド・スタブ
//        var score = 80; // 成績
//        if(score >= 60) { 
//        System.out.println("合格です！"); 
//        } 
//    }
    
//    public static void main(String[]args) { 
//        var score = 60; // 成績
//        if(score >= 60) { 
//        System.out.println("合格です！");
//         } else{ 
//        System.out.println("赤点です。。。");
//         } 
//        } 

    public static void main(String[] args) { 
        var score = 70; // 成績
        if (score == 100) { 
        System.out.println("満点です！"); 
        } else if (score >= 80) { 
        System.out.println("よくできました！");
         } else if (score >= 60) { 
        System.out.println("合格です！");
         } else { 
        System.out.println("赤点です。。。");
         } 
        } 

}
