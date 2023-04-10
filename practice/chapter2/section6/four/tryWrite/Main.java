package practice.chapter2.section6.four.tryWrite;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    /** tryブロックの外で宣言しnullで初期化しないと、finallyブロック内でclose()を呼べない */
    FileWriter fw = null;
    try {
      fw = new FileWriter("test.dat", true);
      fw.write('A');
      fw.flush();
    } catch (IOException e) {
      System.out.println("ファイル書き込みエラーです");
    } finally {
      if (fw != null) {
        try {
          /**
           * close()がIOExceptionを送出する可能性があるため、再度try-catchが必要
           * ただし失敗しても何もできないためcatchブロック内は空にしてある
           */
          fw.close();
        } catch (IOException e2) {
        }
      }
    }
  }
}
