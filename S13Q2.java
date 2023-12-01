import java.util.Date;
import java.text.SimpleDateFormat;
class DATE
{
     public static void main(String args[])
     {
            Date date =new Date();
            SimpleDateFormat df = new SimpleDateFormat();
            
            SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yy");
            System.out.println("current date is "+df1.format(date)); 
            
            SimpleDateFormat df2 = new SimpleDateFormat("MM-dd-yyyy");
            System.out.println("current date is "+df2.format(date)); 
            
            SimpleDateFormat df3 = new SimpleDateFormat("EEEEEE MMMMM dd yyyy");
            System.out.println("current date is "+df3.format(date)); 
            
            SimpleDateFormat df4 = new SimpleDateFormat("E MMMMM dd hh:mm:ss z yyyy");
            System.out.println("current date and time is "+df4.format(date));
            
            SimpleDateFormat df5 = new SimpleDateFormat("dd/mm/yy hh:mm:ss a Z");
            System.out.println("current date and time is "+df5.format(date));
            
            
     } 
}