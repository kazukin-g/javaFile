/**
 * 全ての図形に継承させるクラス。
 * @version 1
 * @author kazukin-g
 * @since 1
 */
public abstract class Figure{
  /** 段数 */
  protected int h;

  /**
   * コンストラクタ。
   * @param h 段数
   */
  public Figure(int h){
    this.h = h;
  }

  /**
   * 段数を返すメソッド。
   * @return 段数
   */
  public int getH(){
    return this.h;
  }

  /** 図形を表示させるメソッド */
  public abstract void display();
}
