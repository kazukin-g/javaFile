/**
 * 四角形のクラス。Figureクラスを継承している。
 * @version 1
 * @author kazukin-g
 * @since 1
 */
public class Square extends Figure{
  /**
   * コンストラクタ。
   * @param h 段数
   */
  public Square(int h){
    super(h);
  }

  /**
   * 四角形を表示するメソッド。
   */
  @Override
  public void display(){
    for(int i = 0; i < h; i++){
      for(int j = 0; j < h; j++){
        System.out.print("＊");
      }
      System.out.println();
    }
  }

}
