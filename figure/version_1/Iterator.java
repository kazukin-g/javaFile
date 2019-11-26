/**
 * 要素の数え上げを実装するIteratorを実装させるクラス
 * @version 1
 * @author kazukin-g
 * @sinse 1
 */
public interface Iterator{
  /**
   * 次に要素があるかどうかを判断するメソッドを実装させる。
   * @return 次の要素があればtrue
   */
  public abstract boolean hasNext();
  /**
   * 次の要素を返すメソッド。
   * @return 次の要素
   */
  public abstract Object next();
  
}