public class ShapeApp {

    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println(shape.getCorner());

        Rectangler rectangler = new Rectangler();
        System.out.println(rectangler.getCorner());
        System.out.println(rectangler.getParentCorner());
    }
    
}
