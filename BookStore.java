import java.util.Random;

public class BookStore implements Notifier
{
  private Random r;
  private boolean awake;
  private int sold;
  private int ID;
  public BookStore()
  {
    awake = false;
    r = new Random();
    generateID();
    sold = 1;
  }

  public void generateID()
  {
    ID = r.nextInt(1000);
  }
  public long setAlarm()
  {
    return 1000; //sets the alarm for 1000 milliseconds
  }

  public void doAlarm()
  {
    if(awake){
      System.out.println("ID: " + ID + " BookStore ");
            System.out.println("The bookstore has sold: " + (sold +
r.nextInt()))
      sold += r.nextInt();
      awake = false;
    }
    else
      awake = true;
  }
}

