public class FiguresIterator implements Iterator{
  private Figures figures;
  private int index;

  public FiguresIterator(Figures figures){
    this.figures = figures;
    this.index = 0;
  }

  @Override
  public boolean hasNext(){
    if(index < figures.getLength()){
      return true;
    } else {
      return false;
    }
  }

  @Override
  public Object next(){
    Figure figure = figures.getFiguresAt(index);
    index++;
    return figure;
  }

}
