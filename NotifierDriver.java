import java.util.*;

public class NotifierDriver
{
  public static void main(String[] args)
  {
    Timer t = new Timer();

    BookStore a = new BookStore();
    Student b = new Student();
    Faculty c = new Faculty();

    do{
      t.schedule(a.doAlarm(), a.setAlarm());
      System.out.println(t.getPeriod());
      t.schedule(b.doAlarm(), b.setAlarm());
      System.out.println(t.getPeriod());
      t.schedule(c.doAlarm(), c.setAlarm());
      System.out.println(t.getPeriod());
    } while (t.getPeriod < 100000000);
  }
}


