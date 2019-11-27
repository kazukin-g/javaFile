/**
 * 集合体に対応するIteratorを一個生成するメソッドを強制するインタフェース。
 * @version 1
 * @author kazukin-g
 * @since 1
 */
public interface Aggregate{
  /**
   * Iteratorを実装させるための抽象メソッド。
   * @return Iteratorインタフェースを継承したクラス。
   */
  public abstract Iterator iterator();

}
