/* AUTOFULLER Created by 
 * 						- MUSTAFA SARIGÜL 
 * 						- EMÝR ÖZÇOPUR 
 * 						- ÝSMAÝL ALP SEL
 *							-27.12.2016-00:21
 */


package projectt;

import java.util.Scanner;

public class maýn_menu {
	
	public static int qq=1234;
	static int choice;
	static int i;
	static int choice_liter_gasoline;
	static int choice_liter_diesel;
	static int choice_liter_gas;
	static int dec_gasoline;
	static int dec_diesel;
	static int dec_gas;
	public int system_main_menu;
	public static int pass ;
	public static int abc, abc1, abc2, abc3,pc;
	static double q, w, e, r, t, y, u, s, l,z;
	public static int fpass;
	static int counter_c;
	static int counter_a;
	static double gasoline_cost;
	static double diesel_cost;
	static double gas_cost;
	public static int total_gasoline_liter, total_diesel_liter,total_gas_liter = 0;
	public static double sum_diesel_cost, sum_gasoline_cost, sum_gas_cost = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		methods maýn_menu = new methods();
		methods maýn_menudef = new methods();

		maýn_menu.wellcome();
		
		System.out.println(" Firstly enter a  cost of gasoline for configure: ");
		gasoline_cost = input.nextDouble();
		
		System.out.println(" Secondly enter a  cost of diesel for configure :");
		diesel_cost = input.nextDouble();
		
		System.out.println(" Third enter a  cost of gas for configure: ");
		gas_cost = input.nextDouble();
		
		System.out.println("     YOUR CONFIGIRATION          ");
		System.out.println("  Gasoline cost of : " + gasoline_cost );
		System.out.println("  Diesel cost of   : " + diesel_cost );
		System.out.println("  Gas cost of      : " + gas_cost );
		System.out.println("  Attation         : Password is [1234] . Please change the password!");
		System.out.println(" ");
		System.out.println(" OK! All are configured.Program will execute now.");
		System.out.println(" ");
		
		maýn_menu.maýn_menu();
		System.out.println(" Current price: -Gasoline :" + gasoline_cost +" TL" + " -Diesel :"+diesel_cost+" TL" + " -Gas :"+gas_cost+" TL" );
		System.out.println(" -------------------------------------------");
		for (i = 1;;) {

			choice = input.nextInt();   

			switch (choice) {

			case 1:
				System.out.println(" How Much Liters GASOLINE Do You Want To Buy ?" );
				choice_liter_gasoline = input.nextInt();
				
				sum_gasoline_cost = sum_gasoline_cost + (choice_liter_gasoline * gasoline_cost);

				
				total_gasoline_liter = choice_liter_gasoline + total_gasoline_liter;

				System.out.println(" You will take " + choice_liter_gasoline+ " liters GASOLÝNE and will pay "+ choice_liter_gasoline 
						* gasoline_cost + " TL for GASOLINE...");
				System.out.println(" ");
				System.out.println(" Attantion Note : GASOLÝNE Cost is "+ gasoline_cost + " TL per liter. ");
				System.out.println(" ");
				System.out.println(" Are you sure?");
				System.out.println(" If you want to continue ,please enter 1 OR you can cancel the selling by enter 0.");
				dec_gasoline = input.nextInt();

				switch (dec_gasoline) {
				case 1:
					System.out.println(" Your tank is fulling with gasoline.Wait!");
					System.out.println(" -------------------------------------------");
					counter_a++;

					break;
				case 0:
					System.out.println(" Your selling has been canceled!");
					System.out.println(" -------------------------------------------");
					counter_c++;
					total_gasoline_liter =  total_gasoline_liter-choice_liter_gasoline ;
					sum_gasoline_cost = sum_gasoline_cost - (choice_liter_gasoline * gasoline_cost);
					break;
				default:
					System.out.println(" ! PLEASE PRESS 1 OR 0.DO NOT ENTER A VALUE OTHER THAN 1 AND 0!");
				}
				maýn_menu.maýn_menu();
				System.out.println(" Current price: -Gasoline :" + gasoline_cost +" TL" + " -Diesel :"+diesel_cost+" TL" + " -Gas :"+gas_cost+" TL" );
				System.out.println(" -------------------------------------------");
				break;
			case 2:
				System.out.println(" How Much Liters DIESEL Do You Want To Buy ?");
				choice_liter_diesel = input.nextInt();
				
				sum_diesel_cost = sum_diesel_cost+ (choice_liter_diesel * diesel_cost);
				
				total_diesel_liter = choice_liter_diesel + total_diesel_liter;

				System.out.println(" You will take " + choice_liter_diesel+ " liters DÝESEL and will pay " + choice_liter_diesel
						* diesel_cost + " TL for DIESEL...");
				System.out.println(" ");
				System.out.println(" Attantion Note : DIESEL cost is "+ diesel_cost + " TL per liter. ");
				System.out.println(" ");
				System.out.println(" Are you sure?");
				System.out.println(" If you want to continue ,please enter 1 OR you can cancel the selling by enter 0.");
				dec_diesel = input.nextInt();
				switch (dec_diesel) {
				case 1:
					System.out.println(" Your tank is fulling with diesel.Wait!");
					System.out.println(" -------------------------------------------");
					counter_a++;

					break;
				case 0:
					System.out.println(" Your selling has been canceled!");
					System.out.println(" -------------------------------------------");
					counter_c++;
					total_diesel_liter =  total_diesel_liter-choice_liter_diesel ;
					sum_diesel_cost = sum_diesel_cost - (choice_liter_diesel * diesel_cost);
					break;
				default:
					System.out.println("PLEASE PRESS 1 OR 0.DO NOT ENTER A VALUE OTHER THAN 1 AND 0!");
				}
				maýn_menu.maýn_menu();
				System.out.println(" Current price: -Gasoline :" + gasoline_cost +" TL" + " -Diesel :"+diesel_cost+" TL" + " -Gas :"+gas_cost+" TL" );
				System.out.println(" -------------------------------------------");
				break;
			case 3:
				System.out.println(" How Much Liters GAS Do You Want To Buy ?" );
				choice_liter_gas = input.nextInt();
				
				sum_gas_cost = sum_gas_cost + (choice_liter_gas * gas_cost);
				
				total_gas_liter = choice_liter_gas + total_gas_liter;

				System.out.println(" You will take " + choice_liter_gas+ " liters GAS and will pay " + choice_liter_gas
						* gas_cost + " TL for GAS...");
				System.out.println(" ");
				System.out.println(" Attantion Note : GAS cost is "+ gas_cost + " TL per liter. ");
				System.out.println(" ");
				System.out.println(" Are you sure?");
				System.out.println(" If you want to continue ,please enter 1 OR you can cancel the selling by enter 0.");
				dec_gas = input.nextInt();
				switch (dec_gas) {
				case 1:
					System.out.println(" Your tank is fulling with gas.Wait!");
					System.out.println(" -------------------------------------------");
					counter_a++;
					break;
				case 0:
					System.out.println(" Your selling has been canceled!");
					System.out.println(" -------------------------------------------");
					counter_c++;
					total_gas_liter =  total_gas_liter - choice_liter_gas ;
					sum_gas_cost = sum_gas_cost - (choice_liter_gas * gas_cost);
					break;
				default:
					System.out.println(" PLEASE PRESS 1 OR 0.DO NOT ENTER A VALUE OTHER THAN 1 AND 0!");
				}
				maýn_menu.maýn_menu();
				System.out.println(" Current price: -Gasoline :" + gasoline_cost +" TL" + " -Diesel :"+diesel_cost+" TL" + " -Gas :"+gas_cost+" TL" );
				System.out.println(" -------------------------------------------");
				break;
			case 9:
				System.out.println(" Please enter password for Personal System...:");
				for (i = 1;;) {
					pass = input.nextInt();
					
					if (pass == qq) {

						System.out.println(" ");
						System.out.println("   ---You are in the Personal System---   ");
						System.out.println(" ");
						System.out.println(" - Press to 1 learn cancellations and acceptances. ");
						System.out.println(" - Press to 2 change the cost of gasoline.");
						System.out.println(" - Press to 3 change the cost of diesel.  ");
						System.out.println(" - Press to 4 change the cost of gas.     ");
						System.out.println(" - Press to 5 print the summary of day.   ");
						System.out.println(" - Press to 6 change the password.        ");
						System.out.println(" Press to 99 go to menu. ");

						fpass = input.nextInt();

						switch (fpass) {
						case 1:
							System.out.println(" Total accepts: " + counter_a);
							System.out.println(" Total cancels: " + counter_c);
							System.out.println(" Press to 99 for go back");
							System.out.println("  If you enter a value other than 99,you will direct to main menu.For:Security");
							abc = input.nextInt();
							if (abc == 99) {
								System.out.println(" Please enter password for PS.:");
								continue;
							} else
							System.out.println(" ----------------------");
							System.out.println(" You Have Entered a Value Other Than 99. ");
							System.out.println(" So, You are directing to Main Menu!");
							System.out.println(" ----------------------");
							maýn_menu.maýn_menu();
							System.out.println(" Current price: -Gasoline :" + gasoline_cost +" TL" + " -Diesel :"+diesel_cost+" TL" + " -Gas :"+gas_cost+" TL" );
							System.out.println(" -------------------------------------------");
							break;

						case 2:
							System.out.println(" Cost is " + gasoline_cost+ "TL.");
							System.out.println(" Enter a new cost:  ");
							q = input.nextDouble();
							if (q > gasoline_cost)
								gasoline_cost = q;
							
							System.out.println(" New gasoline cost:" + q);
							System.out.println(" Gasoline cost has been changed");
							System.out.println(" Press to 99 for go back");
							System.out.println("  If you enter a value other than 99,you will direct to main menu.For:Security");
							abc = input.nextInt();
							if (abc == 99) {
								System.out.println(" Please enter password for PS.:");
								continue;
							} else {
								System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								System.out.println(" !!!.You entered wrong option for go to back !!!");
								System.out.println(" ");
								System.out.println(" Please Try From The Beginning.(For Security Reasons)");
								System.out.println(" ");
								System.out.println(" You Are Directing To The Main Menu.");
								System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								maýn_menu.maýn_menu();
								System.out.println(" Current price: -Gasoline :" + gasoline_cost +" TL" + " -Diesel :"+diesel_cost+" TL" + " -Gas :"+gas_cost+" TL" );
								System.out.println(" -------------------------------------------");
								break;
							}

						case 3:
							System.out.println(" Cost is " + diesel_cost+ "TL.");
							System.out.println(" Enter a new cost:  ");
							w = input.nextDouble();
							if (w > diesel_cost)
								diesel_cost = w;
							
							System.out.println(" New diesel cost:" + w);
							System.out.println(" Diesel cost has been changed");
							System.out.println(" Press to 99 for go back");
							System.out.println(" If you enter a value other than 99,you will direct to password screen.For:Security");
							abc1 = input.nextInt();
							if (abc1 == 99) {
								System.out.println(" Please enter password for PS.:");
								continue;
							} else {
								System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								System.out.println(" !!!.You entered wrong option for go to back !!!");
								System.out.println(" ");
								System.out.println(" Please Try From The Beginning.(For Security Reasons)");
								System.out.println(" ");
								System.out.println(" You Are Directing To The Main Menu.");
								System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								maýn_menu.maýn_menu();
								System.out.println(" Current price: -Gasoline :" + gasoline_cost +" TL" + " -Diesel :"+diesel_cost+" TL" + " -Gas :"+gas_cost+" TL" );
								System.out.println(" -------------------------------------------");
								break;
							}
						case 4:
							System.out.println(" Cost is " + gas_cost + "TL.");
							System.out.println(" Enter a new cost:  ");
							e = input.nextDouble();
							if (e > gas_cost)
								gas_cost = e;
							
							System.out.println(" New gas cost:" + e);
							System.out.println(" Gas cost has been changed");
							System.out.println("  If you enter a value other than 99,you will direct to main menu.For:Security");
							System.out.println(" Press to 99 for go back");
							abc2 = input.nextInt();
							if (abc2 == 99) {
								System.out.println(" Please enter password for PS.:");
								continue;
							} else {
								System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								System.out.println(" !!!.You entered wrong option for go to back !!!");
								System.out.println(" ");
								System.out.println(" Please Try From The Beginning.(For Security Reasons)");
								System.out.println(" ");
								System.out.println(" You Are Directing To The Main Menu.");
								System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								maýn_menu.maýn_menu();
								System.out.println(" Current price: -Gasoline :" + gasoline_cost +" TL" + " -Diesel :"+diesel_cost+" TL" + " -Gas :"+gas_cost+" TL" );
								System.out.println(" -------------------------------------------");
								break;
							}
						case 5:
							System.out.println(" - Today sales of GASOLINE liters : "+ total_gasoline_liter);
							System.out.println(" - Today sales of DIESEL liters : "+ total_diesel_liter);
							System.out.println(" - Today sales of GAS liters : "+ total_gas_liter);
							System.out.println(" + Today sales of GASOLINE cost  : "+ sum_gasoline_cost);
							System.out.println(" + Today sales of DIESEL cost : "+ sum_diesel_cost);
							System.out.println(" + Today sales of GAS cost : "+ sum_gas_cost);
							System.out.println(" ");
							System.out.println("  Press to 99 for go back");
							System.out.println("  If you enter a value other than 99,you will direct to main menu.For:Security");
							l = input.nextInt();
							if (l == 99) {
								System.out
										.println(" Please enter password for PS.:");
								continue;
							} else
								System.out.println(" ----------------------");
							System.out
									.println(" You Have Entered a Value Other Than 99. ");
							System.out
									.println(" So, You are directing to Main Menu!");
							System.out.println(" ----------------------");
							maýn_menu.maýn_menu();
							System.out.println(" Current price: -Gasoline :" + gasoline_cost +" TL" + " -Diesel :"+diesel_cost+" TL" + " -Gas :"+gas_cost+" TL" );
							System.out.println(" -------------------------------------------");
							break;
						case 6:
							System.out.println(" Please enter a new password.");
							qq=input.nextInt();
							pass=qq*1;
							System.out.println(" The password was changed to " + qq + ".");
							System.out.println(" ");
							System.out.println("  Press to 99 for go back");
							System.out.println("  If you enter a value other than 99,you will direct to main menu.For:Security");
							z=input.nextInt();
							if (z == 99) {
								System.out.println(" Please enter password for PS.:");
								continue;}
						case 99:
							maýn_menu.maýn_menu();
							System.out.println(" Current price: -Gasoline :" + gasoline_cost +" TL" + " -Diesel :"+diesel_cost+" TL" + " -Gas :"+gas_cost+" TL" );
							System.out.println(" -------------------------------------------");
							break;
						default:
							System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
							System.out.println(" !!!.You entered wrong menu option for Personal System.!!!");
							System.out.println(" ");
							System.out.println(" Please Try From The Beginning.(For Security Reasons)");
							System.out.println(" ");
							System.out.println(" You Are Directing To The Main Menu.");
							System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
							maýn_menu.maýn_menu();
							System.out.println(" Current price: -Gasoline :" + gasoline_cost +" TL" + " -Diesel :"+diesel_cost+" TL" + " -Gas :"+gas_cost+" TL" );
							System.out.println(" -------------------------------------------");
						}
						break;
					}
					else {
						System.out.println("----------------------------");
						System.out.println(" You entered wrong password.");
						System.out.println("  Please Try Again");
						System.out.println("   Password: ");
					}
				}
				break;
			default:// maýn menu default
				maýn_menudef.maýn_menudef();
				System.out.println(" Current price: -Gasoline :" + gasoline_cost +" TL" + " -Diesel :"+diesel_cost+" TL" + " -Gas :"+gas_cost+" TL" );
				System.out.println(" -------------------------------------------");
			}

		}
	}
}