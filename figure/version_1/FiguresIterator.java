public class FiguresIterator implements Iterator{
  private Figures figures;
  private int index;
  
  public FiguresIterator(Figures figures){
    this.figures = figures;
    this.index = 0;
  }
  
  @override
  public boolean hasNext(){
    if(index < figures.getLength()){
      return true;
    } else {
      return false;
    }
  }
  
  @override
  public Object next(){
    Figure figure = Figures.getFiguresAt(index);
    index++;
    return figure;
  }
  
}