class Book{
      int bookID;
      String title,author;
      double price;
      static int count;
   
   Book(int i, String t, String a, double p){
   bookID=i;
   title=t;
   author=a;
   price=p;
   count++;
   } 
   
   void display(){
   System.out.println("Book ID:"+bookID);
   System.out.println("Book Title:"+title);
   System.out.println("Book Author:"+author);
   System.out.println("Book Price:"+price);
   }
   
   Book search(int id){
   if (bookID==id)
      return this;
      
   else 
      return null;
   }
   
   Book search(String s){
   if (title==s)
      return this;
   else
      return null;
   }
   Book costlier(Book b){
      if (price>b.price)
         return this;
      else
         return b;}
   }      


public class bookdemo{
   public static void main(String[] args){
      
        Book b1=new Book(105,"Wings of Fire","APJ Abdul Kalam",500);
        Book b2=new Book(100,"Python","Guido",700);
        
        System.out.println("Book Details are:");
        System.out.println("---------------------------------------------------------");        b1.display();
        System.out.println("---------------------------------------------------------");
        b2.display();
        System.out.println("---------------------------------------------------------");
        System.out.println("Search by Book ID:");
        //System.out.println("---------------------------------------------------------");
        Book result=b1.search(105);
        if (result != null)
            b1.display();
        else {
            System.out.println("Book Not Found by ID");
         }
         System.out.println("---------------------------------------------------------");
         
         System.out.println("Search by Book Name:");
         
         result=b2.search("Python");
         if (result !=null){
            b2.display();    
         }
         else {
             System.out.println("Book not found by Name");
         }
         System.out.println("---------------------------------------------------------");
         System.out.println("Costliest book is:");
         Book b3=b1.costlier(b2);
         b3.display();
         System.out.println("---------------------------------------------------------");
         System.out.println("Total Count:"+Book.count);
   }
 }      
        
        
