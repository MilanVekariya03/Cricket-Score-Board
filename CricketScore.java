import java.util.Scanner;

class Scoring
{
	boolean win;
	int total1;
	int total2;

	Scoring() 
	{
		
	}

	void Scoring1(int total_overs, String b[]) 
	{

		// Players p = new Players();
		String playing_batsmen_1 = b[0];
		String playing_batsmen_2 = b[1];
		int wicket = 0;
		int runs = 0;
		int w = 2;
		for (int i = 0; i < total_overs; i++) 
		{
			System.out.println("FOR NEXT OVER");
			System.out.println("Striker      : " + playing_batsmen_1);
			System.out.println("Non Striker  : " + playing_batsmen_2);

			for (int j = 1; j <= 6; j++) 
			{
				Scanner sc = new Scanner(System.in);
				System.out.println();
				System.out.println("Enter 0 for wicket,1 for legal, 2 for wide ball , 3 for No Ball");
				int choice2 = sc.nextInt();
				System.out.println();
				if (choice2 == 0) 
				{
					if (wicket == 9) 
					{
						System.out.println();
						System.out.println("=================================");
						System.out.println("TOTAL OVERS    : " + i + "." + j);
						System.out.println("TOTAL RUNS     : " + runs);
						System.out.println("TOTAL WICKETS  : " + ++wicket);
						System.out.println("=================================");
						break;
					} 
					else 
					{
						if (w < 10) 
						{
							playing_batsmen_1 = b[w];
							w++;
						}
						wicket++;
						System.out.println();
						System.out.println("Overs        : " + i + "." + j);
						System.out.println("Runs         : " + runs);
						System.out.println("Wickets      : " + wicket);
						System.out.println("Striker      : " + playing_batsmen_1);
						System.out.println("Non Striker  : " + playing_batsmen_2);
					}
				} 
				else if (choice2 == 1) 
				{
					System.out.println("enter runs scored");
					int choice1 = sc.nextInt();

					switch (choice1) {
						case 0:
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 1:
							runs++;
							String temp = playing_batsmen_1;
							playing_batsmen_1 = playing_batsmen_2;
							playing_batsmen_2 = temp;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 2:
							runs += 2;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 3:
							runs += 3;
							System.out.println();
							temp = playing_batsmen_1;
							playing_batsmen_1 = playing_batsmen_2;
							playing_batsmen_2 = temp;
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 4:
							runs += 4;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 6:
							runs += 6;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						default:
							j--;
							System.out.println("Invalid Input");
					}
				} 
				else if (choice2 == 2) 
				{
					System.out.println("Enter runs scored");
					runs++;
					j--;
					int choice1 = sc.nextInt();
					switch (choice1) {
						case 0:
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 1:
							runs++;
							String temp = playing_batsmen_1;
							playing_batsmen_1 = playing_batsmen_2;
							playing_batsmen_2 = temp;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 2:
							runs += 2;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 3:
							runs += 3;
							temp = playing_batsmen_1;
							playing_batsmen_1 = playing_batsmen_2;
							playing_batsmen_2 = temp;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 4:
							runs += 4;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						default:
							System.out.println("Invalid Input");
					}
				} 
				else if (choice2 == 3) 
				{
					runs++;
					j--;
					System.out.println("enter runs scored");
					int choice1 = sc.nextInt();
					switch (choice1) {
						case 0:
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 1:
							runs++;
							String temp = playing_batsmen_1;
							playing_batsmen_1 = playing_batsmen_2;
							playing_batsmen_2 = temp;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 2:
							runs += 2;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 3:
							runs += 3;
							temp = playing_batsmen_1;
							playing_batsmen_1 = playing_batsmen_2;
							playing_batsmen_2 = temp;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 4:
							runs += 4;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 6:
							runs += 6;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						default:
							System.out.println("Invalid Input");
					}
				} 
				else 
				{
					System.out.println("Enter valid Input");
					j--;
				}
			}
			if (wicket == 10) 
			{
				total1 = runs;
				break;
			}
			System.out.println();
			System.out.println("=================================");
			System.out.println("TOTAL OVERS    : " + ++i + ".0");
			i--;
			System.out.println("TOTAL RUNS     : " + runs);
			System.out.println("TOTAL WICKETS  : " + wicket);
			System.out.println("=================================");
			String temp = playing_batsmen_1;
			playing_batsmen_1 = playing_batsmen_2;
			playing_batsmen_2 = temp;
			System.out.println();
			total1 = runs;
		}
	}

	void Scoring2(int total_overs, String b[]) 
	{

		// Players p = new Players();
		String playing_batsmen_1 = b[0];
		String playing_batsmen_2 = b[1];
		int wicket = 0;
		int runs = 0;
		int w = 2;
		for (int i = 0; i < total_overs; i++) 
		{
			System.out.println("FOR NEXT OVER");
			System.out.println("Striker      : " + playing_batsmen_1);
			System.out.println("Non Striker  : " + playing_batsmen_2);

			for (int j = 1; j <= 6; j++) 
			{
				Scanner sc = new Scanner(System.in);
				System.out.println();
				System.out.println("Enter 0 for wicket,1 for legal, 2 for wide ball , 3 for No Ball");
				int choice2 = sc.nextInt();
				System.out.println();
				if (choice2 == 0) 
				{
					if (wicket == 9) 
					{
						System.out.println();
						System.out.println("=================================");
						System.out.println("TOTAL OVERS    : " + i + "." + j);
						System.out.println("TOTAL RUNS     : " + runs);
						System.out.println("TOTAL WICKETS  : " + ++wicket);
						System.out.println("=================================");

						break;
					} 
					else 
					{
						if (w < 10) 
						{
							playing_batsmen_1 = b[w];
							w++;
						}
						wicket++;
						System.out.println();
						System.out.println("Overs        : " + i + "." + j);
						System.out.println("Runs         : " + runs);
						System.out.println("Wickets      : " + wicket);
						System.out.println("Striker      : " + playing_batsmen_1);
						System.out.println("Non Striker  : " + playing_batsmen_2);
					}
				}
				else if (choice2 == 1) 
				{
					System.out.println("enter runs scored");
					int choice1 = sc.nextInt();

					switch (choice1) {
						case 0:
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 1:
							runs++;
							String temp = playing_batsmen_1;
							playing_batsmen_1 = playing_batsmen_2;
							playing_batsmen_2 = temp;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 2:
							runs += 2;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 3:
							runs += 3;
							System.out.println();
							temp = playing_batsmen_1;
							playing_batsmen_1 = playing_batsmen_2;
							playing_batsmen_2 = temp;
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 4:
							runs += 4;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 6:
							runs += 6;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						default:
							j--;
							System.out.println("Invalid Input");
					}
				} 
				else if (choice2 == 2) 
				{
					System.out.println("enter runs scored");
					runs++;
					j--;
					int choice1 = sc.nextInt();
					switch (choice1) {
						case 0:
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 1:
							runs++;
							String temp = playing_batsmen_1;
							playing_batsmen_1 = playing_batsmen_2;
							playing_batsmen_2 = temp;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 2:
							runs += 2;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 3:
							runs += 3;
							temp = playing_batsmen_1;
							playing_batsmen_1 = playing_batsmen_2;
							playing_batsmen_2 = temp;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 4:
							runs += 4;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						default:
							System.out.println("Invalid Input");
					}
				} 
				else if (choice2 == 3) 
				{
					runs++;
					j--;
					System.out.println("enter runs scored");
					int choice1 = sc.nextInt();
					switch (choice1) {
						case 0:
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 1:
							runs++;
							String temp = playing_batsmen_1;
							playing_batsmen_1 = playing_batsmen_2;
							playing_batsmen_2 = temp;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 2:
							runs += 2;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 3:
							runs += 3;
							temp = playing_batsmen_1;
							playing_batsmen_1 = playing_batsmen_2;
							playing_batsmen_2 = temp;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 4:
							runs += 4;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						case 6:
							runs += 6;
							System.out.println();
							System.out.println("Overs        : " + i + "." + j);
							System.out.println("Runs         : " + runs);
							System.out.println("Wickets      : " + wicket);
							System.out.println("Striker      : " + playing_batsmen_1);
							System.out.println("Non Striker  : " + playing_batsmen_2);
							break;
						default:
							System.out.println("Invalid Input");
					}
				} 
				else 
				{
					System.out.println("Enter valid Input");
					j--;
				}
				total2 = runs;
				if (total2 > total1) 
				{
					System.out.println();
					System.out.println("=================================");
					System.out.println("TOTAL OVERS    : " + i + "." + j);
					System.out.println("TOTAL RUNS     : " + runs);
					System.out.println("TOTAL WICKETS  : " + wicket);
					System.out.println("=================================");
					break;
				}
			}
			total2 = runs;
			if (total2 > total1) {
				break;
			}
			if (wicket == 10) {
				total2 = runs;
				break;
			}
			System.out.println();
			System.out.println("TOTAL OVERS : " + ++i + ".0");
			i--;
			System.out.println("TOTAL RUNS : " + runs);
			System.out.println("TOTAL WICKETS : " + wicket);
			String temp = playing_batsmen_1;
			playing_batsmen_1 = playing_batsmen_2;
			playing_batsmen_2 = temp;
			System.out.println();
		}
	}

	/*void check() 
	{
		
	}

	void compare() 
	{

	}*/
}

class Main 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);

		String Team_A[] = new String[11];
		System.out.println();
		System.out.println("Enter 11 players name of Team A : ");
		System.out.println();
		for (int i = 0; i < Team_A.length; i++) {
			Team_A[i] = sc.nextLine();
		}
		System.out.println();

		String Team_B[] = new String[11];
		System.out.println("Enter 11 players name of Team B : ");
		System.out.println();
		for (int i = 0; i < Team_B.length; i++) {
			Team_B[i] = sc.nextLine();
		}
		System.out.println();

		System.out.println("Enter total overs : ");
		System.out.println();
		int overs = sc.nextInt();
		System.out.println();

		/*Scoring compare = new Scoring();*/
		Scoring team1 = new Scoring();
		Scoring team2 = new Scoring();

		System.out.println("************** 1st INNINGS **************");
		System.out.println();
		team1.Scoring1(overs, Team_A);

		System.out.println("************** 2nd INNINGS **************");
		System.out.println();
		team1.Scoring2(overs, Team_B);

		//compare.compare();
		if (team1.total1 > team1.total2) {
			System.out.println();
			System.out.println("*");
			System.out.println("*  Team A won!  *");
			System.out.println("*");
		} else if (team1.total2 > team1.total1) {
			System.out.println();
			System.out.println("*");
			System.out.println("*  Team B won!  *");
			System.out.println("*");
		} else {
			System.out.println();
			System.out.println("***** IT\'S A TIE *****");
			System.out.println();
			System.out.println("*****  SUPER OVER  *****");
			System.out.println();
			System.out.println("************** 1st INNINGS **************");
			System.out.println();
			team2.Scoring1(1, Team_A);
			System.out.println("************** 2nd INNINGS **************");
			System.out.println();
			team2.Scoring2(1, Team_B);
			if (team2.total1 > team2.total2) 
			{
				System.out.println();
				System.out.println("*");
				System.out.println("*  Team A won!  *");
				System.out.println("*");
			} 
			else if (team2.total1 < team2.total2) 
			{
				System.out.println();
				System.out.println("*****************");
				System.out.println("*  Team B won!  *");
				System.out.println("*****************");
			} 
			else 
			{
				System.out.println();
				System.out.println("");
				System.out.println("*  IT/'S A DRAW  *");
				System.out.println("");
			}
		}
	}
}