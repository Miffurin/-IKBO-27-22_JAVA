package Tests;

import Classes.Author;

public class AuthorTest {
  public AuthorTest() {
    System.out.println("Author test");

    Author a1 = new Author("Neli", "nelo@author.com", 'm');
    Author a2 = new Author("Koy", "koy@author.com", 'z');

    System.out.println("author name test");
    if (!(a1.GetName() == "Neli" && a2.GetName() == "Koy")) {
      System.out.println("test not passed");
    }
    System.out.println("test passed");

    System.out.println("author email test");

    a1.SetEmail("authors@author.com");
    a2.SetEmail("authors@author.com");

    if (!(a1.GetEmail() == a2.GetEmail() && a2.GetEmail() == "authors@author.com")) {
      System.out.println("test not passed");
    }
    System.out.println("test passed");

    System.out.println("author gender test");

    if (!(a1.getGender() == 'm' && a2.getGender() == 'w')) {
      System.out.println("test not passed");
    }
    System.out.println("test passed");

    System.out.println(a1);
    System.out.println(a2);

  }
}
