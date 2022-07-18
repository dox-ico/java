class JSample2_1{
    public static void main(String args[]){
      int n[] = {18, 29, 37};
  
      System.out.println("開始します");
  
      try{
        for (int i = 0; i < 5; i++){
          System.out.println(n[i]);
        }
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("配列の範囲を超えています");
      }
  
      System.out.println("終了しました");
    }
  }
