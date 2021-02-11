import java.util.Scanner;
public class WiFiDiagnosis {

	public static void main(String[] args)
	{
		String yesOrNo;
		Scanner sc= new Scanner(System.in);
		
		//Header
		System.out.print("If you have a problem with internet connectivity,");
		System.out.println("this WiFi Diagnosis might work." + "\n");
		
		System.out.println("First step:Reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		
		yesOrNo = sc.nextLine();
		
		if(yesOrNo.equalsIgnoreCase("yes"))
		{
			System.out.print("Rebooting your computer seemed to work");
			System.exit(0);
		}
		else if(yesOrNo.equalsIgnoreCase("no"))
		{
			System.out.println("Step two:Reboot router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			
			yesOrNo = sc.nextLine();
			
			if(yesOrNo.equalsIgnoreCase("yes"))
			{
				System.out.print("Rebooting your router seemed to work");
				System.exit(0);
			}
			else if(yesOrNo.equalsIgnoreCase("no"))
			{
				System.out.print("Step three:make sure the cables to your router are plugged");
				System.out.println("in firmly and your router is getting power");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				
				yesOrNo = sc.nextLine();
				if(yesOrNo.equalsIgnoreCase("yes"))
				{
					System.out.println("Checking the routers cables seemed to work");
					System.exit(0);
				}
				else if(yesOrNo.equalsIgnoreCase("no"))
				{
					System.out.println("Fourth step: move your computer closer to your router");
					System.out.println("Now are you able to connect with the internet? (yes or no)");
					
					yesOrNo = sc.nextLine();
					
					if (yesOrNo.equalsIgnoreCase("yes"))
					{
						System.out.println("Moving your computer seemed to work");
						System.exit(0);
					}
					else if(yesOrNo.equalsIgnoreCase("no"))
					{
						System.out.println("Fifth step: Contact your ISP");
						System.out.println("Make sure your ISP is hooked up to your router.");
						System.exit(0);
					}
				}
			}
		}
	}
}
