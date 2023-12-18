package Tests;

import Classes.Book;

public class BookTest {
    public BookTest() {

        System.out.println("Book test");

        Book b1 = new Book("Geoffrey Richter", "CLR via C#", 0);
        Book b2 = new Book("Andrew Troelsen, Philip Japikse", "C# 7 programming language and .NET and .NET Core platforms");
        Book b3 = new Book("java for testers");

        b1.SetName("C# = Java");
        b2.SetName("C# = Java");
        b3.SetName("C# = Java");

        System.out.println("name test\n\n");
        if (!(b1.GetName() == b2.GetName() && b2.GetName() == b3.GetName() && b3.GetName() == "C# = Java")) {
            System.out.println("test not pass");
            return;
        }
        System.out.println("name test passed");

        b1.SetAuthor("Mordvinov V.A");
        b2.SetAuthor("Mordvinov V.A");
        b3.SetAuthor("Mordvinov V.A");

        System.out.println("author test");
        if (!(b1.GetAuthor() == b2.GetAuthor() && b2.GetAuthor() == b3.GetAuthor() && b3.GetAuthor() == "Mordvinov V.A")) {
            System.out.println("test not pass");
            return;
        }
        System.out.println("author test passed");


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


        System.out.println("all tests passed\n");
    }
}
