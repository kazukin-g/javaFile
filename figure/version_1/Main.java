import java.util.Random;

public class Main{
  public static void main(String[] args){
    int h = 4;
    Random rand = new Random();
    Figures figures = new Figures(h);
    for(int i = 0; i < h; i++){
      int type = rand.nextInt(2);
      if(type == 0){
        figures.appendFigure(new Triangle(rand.nextInt(3) + 4));
      } else {
        figures.appendFigure(new Square(rand.nextInt(3) + 4));
      }

      Iterator it = figures.iterator();
      while(it.hasNext()){
        Figure figure = (Figure)it.next();
        figure.display();
        System.out.println();
      }
    }

  }
}
