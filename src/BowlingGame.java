
public class BowlingGame {

	
	public int[] scores = new int [21];
	public char[] printout = new char[21];
	public int rollNum;
	
	public BowlingGame(){
		rollNum=0;
	}
	

	public int getScore(){
		return BaseScore() + StrikeAndSpareBonus();
	}
	
	private int BaseScore() {
		int baseScore=0;
		for (int i =0; i<21; i++){
			baseScore += scores[i];
		}
		return baseScore;
	}
	
	private int StrikeAndSpareBonus() {
		int strikeScore =0;
		int spareScore =0;
		for (int i=0; i<18; i+=2){
			if (scores[i] == 10){
				if (scores[i+2]==10)
					strikeScore += scores[i+2] + scores[i+4];
				else
				strikeScore += scores[i+2] + scores[i+3];
			}
			else if (scores[i] + scores[i+1]==10){;
				spareScore += scores[i+2];
			}
		}
		return strikeScore + spareScore;
	}

	public void roll(int pins) {
		// TODO Auto-generated method stub
		scores[rollNum] = pins;
		if (rollNum%2 ==0 && pins ==10 && rollNum<18){
			scores[rollNum+1] = 0;
			rollNum+=2;
		}
		else{
			rollNum++;
		}
	}


	public String getPrintout() {
		// TODO Auto-generated method stub

		for (int i =0; i<19; i++){
			if (scores[i] == 10){
				printout[i] = 'X';
			}
			else if(scores[i] + scores[i+1] ==10){
				printout[i] = (char) scores[i];
				printout[i+1] = '/';
			}
	
			else {
				printout[i] = (char) scores[i];
				printout[i+1] = (char) scores[i+1];
			}
			
			
		}
		
		return printout.toString();
	}
	
	
	
	
}
