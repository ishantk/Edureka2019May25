
public class Arrays {

	public static void main(String[] args) {
		
		// Let us represent data in Single Value Containers
		
		// Democratic Party Votes from different Region
		int demArizona = 126;
		int demFlorida = 32;
		int demVermont = 230;
		int demTexas = 21;
		int demGeorgia = 200;
		
		// Republican Party Votes from different Region
		int repArizona = 152;
		int repFlorida = 85;
		int repVermont = 121;
		int repTexas = 215;
		int repGeorgia = 13;
		
		// Logic : To add the vote counts
		int demVoteCount = demArizona + demFlorida + demVermont + demTexas + demGeorgia;
		int repVoteCount = repArizona + repFlorida + repVermont + repTexas + repGeorgia;

		// Checking who won !!
		if(demVoteCount > repVoteCount){
			System.out.println(">> Democratic Party Wins by "+(demVoteCount - repVoteCount)+" votes");
		}else{
			System.out.println(">> Republican Party Wins by "+(repVoteCount - demVoteCount)+" votes");
		}
		
		// Challenge : In above Code, if number of regions grown to n. eg n is 100 i.e. 100 regions
		// As n increases developer's effort to code similar thing increases !! :)
		
		// Multi Value Container
		// Array : Containing Data of Same Type i.e. Homogeneous data - all integers :)
		// Array data is indexed
		//			      0    1   2    3   4
		int[] demVotes = {126, 32, 230, 21, 200};
		int[] repVotes = {152, 85, 121, 215, 13};
		
		demVoteCount = 0;
		repVoteCount = 0;
		
		// Reading the Array and adding data :)
		for(int i=0;i<demVotes.length; i++){
			demVoteCount = demVoteCount + demVotes[i];
		}
		
		// Reading the Array and adding data :)
		for(int i=0;i<repVotes.length; i++){
			repVoteCount = repVoteCount + repVotes[i];
		}
		
		// Checking who won !!
		if(demVoteCount > repVoteCount){
			System.out.println(">> Democratic Party Wins by "+(demVoteCount - repVoteCount)+" votes");
		}else{
			System.out.println(">> Republican Party Wins by "+(repVoteCount - demVoteCount)+" votes");
		}
		
		// We can represent the same data in 2-D Array
						// 0     1     2    3    4
		int[][] votes = {
							{126, 32, 230, 21, 200},	// 0th Array ->  Democratic Party
							{152, 85, 121, 215, 13}		// 1st Array ->  Republican Party
						};
		// votes is a reference variable !!
		// Solve the same problem in 2-D Arrays
		
	}

}
