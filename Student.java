import java.util.Random;

public class Student implements Notifier
{
  private Random r;
  private boolean awake;
  private double coordinateX;
  private double coordinateY;
  private int ID;
  public Student()
  {
    awake = false;
    r = new Random();
    generateID();
    coordinateX = 0;
    coordinateY = 0;
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
      System.out.println("ID: " + ID + " Student ");
      coordinateX = r.nextDouble(100);
      coordinateY = r.nextDouble(100);
      System.out.println("The student is at x = " + coordinateX + ", y = "
+ coordinateY);
      sold += r.nextInt();
      awake = false;
    }
    else
      awake = true;
  }
}
