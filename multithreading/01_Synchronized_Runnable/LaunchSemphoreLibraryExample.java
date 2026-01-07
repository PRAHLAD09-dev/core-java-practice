
import java.util.concurrent.Semaphore;

class Student implements Runnable 
{
    private Library library;
    private String name;

    Student(Library library, String name) 
    {
        this.library = library;
        this.name = name;
    }

    @Override
    public void run() {
        library.readBooks(name);
    }
}
class Library {
     static 
        {
            System.out.println("Library class loded");
        }
    private final Semaphore javaBook = new Semaphore(2);
    private final Semaphore dsaBook = new Semaphore(2);
    private final Semaphore springBook = new Semaphore(2);

    public void readBooks(String student) 
    { 
        try 
        {
            javaBook.acquire();
            System.out.println(student + " acquired JAVA");
            Thread.sleep(2000);

            dsaBook.acquire();
            System.out.println(student + " acquired DSA");
             Thread.sleep(2000);

            springBook.acquire();
            System.out.println(student + " acquired SPRINGBOOT");
             Thread.sleep(2000);

        } 
        catch (InterruptedException e) 
        {
            Thread.currentThread().interrupt();
        } 
        finally 
        {
            springBook.release();
            dsaBook.release();
            javaBook.release();
        }
    }
}
public class LaunchSemphoreLibraryExample
{

    public static void main(String[] args) 
    {

        Library lib = new Library();

        new Thread(new Student(lib, "Student1")).start();
        new Thread(new Student(lib, "Student2")).start();
        new Thread(new Student(lib, "Student3")).start();
    }
}