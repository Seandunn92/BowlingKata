import static org.junit.Assert.*;

import org.junit.Test;


public class BowlingTests {
	
	
BowlingGame ourGame;
	


	@Test
	public void ScoreStartsAt0(){
		ourGame = new BowlingGame();
		int expected = 0;
		int actual = ourGame.getScore();
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void Bowling1Returns1(){
		ourGame = new BowlingGame();
		ourGame.roll(1);
		int actual = ourGame.getScore();
		int expected = 1;
		assertEquals(expected, actual);
	
	}
	
	@Test
	public void Bowling2Returns2(){
		ourGame = new BowlingGame();
		ourGame.roll(2);
		int actual = ourGame.getScore();
		int expected = 2;
		assertEquals(expected, actual);
	}
	

	
	@Test
	public void BowlingTwenty1sReturnsTwenty(){
		ourGame = new BowlingGame();
	
		for (int i = 0; i < 20; i++){
			ourGame.roll(1);
			
		}
		
		assertEquals(ourGame.getScore(), 20);
	}

	
	@Test
	public void BowlingFrame0(){
		ourGame = new BowlingGame();
	
		ourGame.roll(3);
		int actual = ourGame.scores[0];
		assertEquals(3, actual);
		assertEquals(ourGame.rollNum, 1);
		
		
		
	}

	
	@Test
	public void Bowling1stFrameStrike(){
		ourGame = new BowlingGame();
		ourGame.roll(10);
		for (int i = 0; i < 18; i++){
			ourGame.roll(1);
			
		}
		
		assertEquals(30, ourGame.getScore());
	}

	
	@Test
	public void perfectGame(){
		ourGame= new BowlingGame();
		for (int i=0; i<12; i++){
			ourGame.roll(10);
		}
		int expected = 300;
		int actual = ourGame.getScore();
		assertEquals(expected, actual);
		
//		String expectedP = "X X X X X X X X X XXX";
//		String actualP =  ourGame.getPrintout();
//		assertEquals(expectedP, actualP);
	}
	
	@Test
	public void firstFrameSpare(){
		ourGame = new BowlingGame();
		ourGame.roll(5);
		ourGame.roll(5);
		for(int i=0; i<18; i++){
			ourGame.roll(1);
		}
		
		int actual = ourGame.getScore();
		int expected = 29;
		assertEquals(expected, actual);
	}
	
	@Test
	public void allFives(){

		ourGame = new BowlingGame();
		for(int i=0; i<21; i++){
			ourGame.roll(5);
		}
		
		int actual = ourGame.getScore();
		int expected = 150;
		assertEquals(expected, actual);
	}
	

	@Test 
	public void allOnesPrintOut(){
		ourGame = new BowlingGame();
		for (int i = 0; i<20; i++){
			ourGame.roll(1);
			
		}
			String actual = ourGame.getPrintout();
			String expected = "11 11 11 11 11 11 11 11 11 11";
			assertEquals(expected, actual);
			
			
	}
	
	@Test 
	public void firstFrameStrikePrintout(){
		ourGame = new BowlingGame();
		
		ourGame.roll(10);
		
		for (int i = 0; i<18; i++){
		   ourGame.roll(1);
		
      	}
		String expected = "X 11 11 11 11 11 11 11 11 11";
		String actual = ourGame.getPrintout();
		assertEquals(expected, actual);
    }
	
//	@Test 
//	public void allZeroThenSpares(){
//		
//		ourGame = new BowlingGame();
//		for (int i=0; i<10; i++){
//			ourGame.roll(0);
//			ourGame.roll(10);
//		}
//		ourGame.roll(0);
//		assertEquals(100, ourGame.getScore());
//		
//		String expected = "0/ 0/ 0/ 0/ 0/ 0/ 0/ 0/ 0/ 0/0";
//		String actual = ourGame.getPrintout();
//		assertEquals(expected, actual);
//		
//	}
	
	
}

