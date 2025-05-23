package Sample;

public class ForSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
//        for(var i = 1; i <= 10; i++) { 
//            System.out.println(i); 
//            } 
        
//        for(int i = 1; i <= 20; i++) { 
//            if(i % 2== 0) {
//            System.out.println(i);
//            }
//        }
        
//        for (int i = 1; i <= 20; i++) { 
//            if (i % 2 != 0) { 
//            // 現在の処理をスキップし、次の繰り返しに進む
//            continue; 
//            } 
//            System.out.println(i); 
//            }
        
//        for (int i = 1; i <= 20; i++) { 
//            if (i % 2 != 0) { 
//            // 現在の処理をスキップし、次の繰り返しに進む
//            continue; 
//            } 
//            System.out.println(i);
//    }
//    }
        for (int i = 2; i <= 100; i+=2) { 
            if (i > 20) { 
            // 繰り返しから抜け出す
            break; 
            } 
            System.out.println(i); 
            }
    }
}

