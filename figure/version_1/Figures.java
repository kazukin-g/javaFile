public class Figures implements Aggregate {
  private Figure[] figures;
  private int last = 0;
  
  public Figures(int maxsize){
    this.figures = new Figure[maxsize];
  }
  
  public Figure getFiguresAt(int index){
    return figures[index];
  }
  
  public void appendFigure(Figure figure){
    this.figures[last] = figure;
    last++;
  }
  
  public int getLength(){
    return this.last;
  }
  
  @override
  public Iterator iterator(){
    return new FiguresIterator(this);
  } 
  
}