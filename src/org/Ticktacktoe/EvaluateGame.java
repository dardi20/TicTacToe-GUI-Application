package org.Ticktacktoe;

/**
 *  
 * @author dardi20
 *
 */

public class EvaluateGame {

	public static String getPlayer() {
		return player;
	}

	public static void setPlayer(String player) {
		EvaluateGame.player = player;
	}

	public static String getStatus() {
		return status;
	}

	public static void setStatus(String status) {
		EvaluateGame.status = status;
	}

	public static String status;
	public static String player;

	public static void evaluateGame(int i, String[] b) {

		while (i <= 9) {

			if (Check_Status.hasWinner(b)) {

				status = player + " WON";
				break;

			}

			switch (i % 2) {
			case 0:
				player = "X";
				break;
			default:
				player = "O";
			}
			
			return;
		}

		if (!Check_Status.hasWinner(b)) {
			status = "DRAW";

		}
	}
}
