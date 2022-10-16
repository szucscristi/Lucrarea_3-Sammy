import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main
{
    static int minute;
    public static void main(String[] args)
    {
        chenar();
        timp();
        rezultat();
    }
    public static int timp()
    {
        System.out.print("Precizati cate minute utilizatorul a folosit o piesa de echipament sportiv: ");
        Scanner inputDevice = new Scanner(System.in);
        minute=inputDevice.nextInt();
        inputDevice.nextLine();
        return minute;
    }
    public static void chenar()
    {
        JOptionPane.showMessageDialog(null, "Sammy’s makes it fun in the sun");
    }
    public static void rezultat()
    {
        int nrminute,ore=0,PretTotal=0;
        nrminute=minute;
        while(nrminute>=60){
            ore++;
            nrminute=nrminute-60;
        }
        PretTotal=40*ore+nrminute;
        System.out.print("Ore: "+ore+"\n");
        System.out.print("Minute: "+nrminute+"\n");
        System.out.print("Pretul total: "+PretTotal+"$");
    }
}