/**
 * 三角形のクラス。Figureクラスを継承している。
 * @version 1
 * @author kazukin-g
 * @sinse 1
 */
public class Triangle extends Figure{
  /**
   * コンストラクタ。
   * @param h 段数
   */
  public Triangle(int h){
    super(h);
  }

  /**
   * 三角形を表示するメソッド。
   */
  @override
  public void display(){
    for(int i = 0; i < h; i++){
      for(int j = 0; j < h; j++){
        if(j < h){
          System.out.print("＊");
        } else {
          System.out.print("　");
        }
      System.out.println();
    }
  }
  
}