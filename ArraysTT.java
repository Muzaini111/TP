import java.util.Scanner;
public class ArraysTT {



	public static void main(String[] args) {
		String Riyadh [][] = {
				{"Fajr","4:16am"},
				{"Dhohr","11:55am"},
				{"Asr","3:24pm"},
				{"Maghreb","6:14pm"},
				{"Isha","7:44pm"}
		};
		String Qassim [][] = {
				{"Fajr","4:25am"},
				{"Dhohr","12:07pm"},
				{"Asr","3:37pm"},
				{"Maghreb","6:28pm"},
				{"Isha","7:58pm"}
		};
		String Mecca [][] = {
				{"Fajr","4:47am"},
				{"Dhohr","12:22pm"},
				{"Asr","3:46pm"},
				{"Maghreb","6:39pm"},
				{"Isha","8:09pm"}
		};
		String Medina [][] = {
				{"Fajr","4:44am"},
				{"Dhohr","12:23pm"},
				{"Asr","3:51pm"},
				{"Maghreb","6:42pm"},
				{"Isha","8:12pm"}
		};
		
		Scanner r = new Scanner(System.in);
		System.out.print("Enter the region name: ");
		String m = r.next();
		
		System.out.print("Enter the prayer to know its time: ");
		String p = r.next();
		
		switch (m) {
		case "Riyadh":
		{
            for(int i = 0 ; i < Riyadh.length ; i++)
				
			{	if(p.equals(Riyadh[i][0])) 
			    {
					System.out.print(Riyadh[i][1]);
					break;
				}
		
			}	
		}
		
		case "Qassim":
		{
            for(int i = 0 ; i < Qassim.length ; i++)
				
			{	if(p.equals(Qassim[i][0])) 
			    {
					System.out.print(Qassim[i][1]);
					break;
				}
		
			}	
		}
		case "Mecca":
		{
            for(int i = 0 ; i < Mecca.length ; i++)
				
			{	if(p.equals(Mecca[i][0])) 
			    {
					System.out.print(Mecca[i][1]);
					break;
				}
		
			}	
		}
		case "Medina":
		{
            for(int i = 0 ; i < Medina.length ; i++)
				
			{	if(p.equals(Medina[i][0])) 
			    {
					System.out.print(Medina[i][1]);
					break;
				}
		
			}	
		}
		
		}
		
		r.close();
		
		
	}

}
