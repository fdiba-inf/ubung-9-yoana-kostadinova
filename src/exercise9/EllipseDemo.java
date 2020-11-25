package exercise9;

public class EllipseDemo {
    public static void main(String[] args) {
      
      Ellipse elips1 = new Ellipse();

        Point startPoint2 = new Point(1, 1);
        Ellipse elips2 = new Ellipse(startPoint2, 5, 6);

        Ellipse elips3 = new Ellipse(elips2);
        
        Ellipse elips4 = new Ellipse();
        elips4.initialize();

        System.out.println("Ellipse 1: " + elips1);
        System.out.println("Ellipse 2: " + elips2);
        System.out.println("Ellipse 3: " + elips3);
        System.out.println("Ellipse 4: " + elips4);

        System.out.println("Ellipse 2 equals Ellipse 1: " + elips2.equal(elips1));
        System.out.println("Ellipse 2 equals Ellipse 3: " + elips2.equal(elips3));
    }
}
