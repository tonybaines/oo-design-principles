package lsp;

public class Client {
  public static void main(String[] args) {
    Rectangle s1 = new Rectangle();
    s1.setHeight(10);
    s1.setWidth(5);
    System.out.println(s1.getArea() == 50);
    

    Rectangle s2 = new Square();
    s2.setHeight(10);
    s2.setWidth(5);
    System.out.println(s2.getArea() == 50);
  }
}
