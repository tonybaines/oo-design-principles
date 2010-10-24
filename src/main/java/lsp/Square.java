package lsp;

public class Square extends Rectangle{
  
  public void setHeight(int height) {
    this.height = height;
    super.setWidth(height);
  }
  public void setWidth(int width) {
    this.width = width;
    super.setHeight(width);
  }
  
}
