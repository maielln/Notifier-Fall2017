import java.util.Random;

public class Faculty implements Notifier
{
  private Random r;
  private boolean awake;
  private double coordinateX;
  private double coordinateY;
  private int ID;
  public Faculty()
  {
    awake = false;
    r = new Random();
    generateID();
    phoneCalls = 1;
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
      System.out.println("ID: " + ID + " Faculty ");
      System.out.println("The faculty member has called: " + phoneCalls +
" people.");
      phoneCalls += r.nextInt(5);
      awake = false;
    }
    else
      awake = true;
  }
}
