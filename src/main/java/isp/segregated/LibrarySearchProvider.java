package isp.segregated;

public interface LibrarySearchProvider {
  String[] findBookByTitle(String title);
  String[] findBookByAuthor(String author);
  String[] findBookByISBN(String isbn);

}
