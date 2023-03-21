//Kristof Rohaly-Medved
//CS110
//Class with information about a book object

public class Book
{
   private String isbn;
   private String title;
   private Author author;
   private String publisher;
   private int numPages;

   /**
      Constructor
   */
   public Book(String i, String t, Author a, String p, int n)
   {
      isbn = i;
      title = t;
      author = a;
      publisher = p;
      numPages = n;
   }
   
   /**
      Constructor making deep copy
      @param other object to copy
   */
   public Book(Book other)
   {
      this(other.isbn, other.title, other.author, other.publisher, other.numPages);
   }
   
   /**
      setIsbn sets isbn to parameter value
      @param isbn value to set isbn to
   */
   public void setIsbn(String i)
   {
      isbn = i;
   }
   
   /**
      setTitle sets title to parameter value
      @param title value to set title to
   */
   public void setTitle(String t)
   {
      title = t;
   }
   
   /**
      setPublisher sets publisher to parameter value
      @param publisher value to set publisher to
   */
   public void setPublisher(String p)
   {
      publisher = p;
   }
   
   /**
      setAuthor sets author to parameter value
      @param author value to set author to
   */
   public void setAuthor(Author a)
   {
      author = a;
   }
   
   /**
      setnumPages sets numPages to parameter value
      @param numPages value to set numPages to
   */
   public void setnumPages(int n)
   {
      numPages = n;
   }
   
   /**
      getIsbn
      @return isbn
   */
   public String getIsbn()
   {
      return isbn;
   }
   
   /**
      getTitle - returns book title
      @return title
   */
   public String getTitle()
   {
      return title;
   }
   
   /**
      getAuthor - returns book author
      @return author
   */
   public Author getAuthor()
   {
      return author;
   }
   
   /**
      getPublisher - returns book publisher
      @return publisher
   */
   public String getPublisher()
   {
      return publisher;
   }
   
   /**
      getnumPages - returns number of pages in book
      @return numpages
   */
   public int getnumPages()
   {
      return numPages;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s\n%s (ISBN-10 #%s, %d pages)", title, author, isbn, numPages);
   }
   
   @Override
   public boolean equals(Object other) //equal if same title, author, and isbn
   {
      Book bOther = (Book)other;
      return this.title.equals(bOther.title) && this.author.equals(bOther.author) && this.isbn.equals(bOther.isbn);
   }
}