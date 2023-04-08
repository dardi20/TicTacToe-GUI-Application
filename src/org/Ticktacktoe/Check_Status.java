package org.Ticktacktoe;
/**
 * hasWinner method checks whether there is a winner each time the user makes a move
 * 
 * @author codei0
 *
 */
public class Check_Status {

	public static boolean hasWinner(String[] b) {

		if (b[0].equals(b[1]) && b[1].equals(b[2])) {
			return true;
		} else if (b[3].equals(b[4]) && b[4].equals(b[5])) {
			return true;
		} else if (b[6].equals(b[7]) && b[7].equals(b[8])) {
			return true;
		} else if (b[0].equals(b[3]) && b[3].equals(b[6])) {
			return true;
		} else if (b[1].equals(b[4]) && b[4].equals(b[7])) {
			return true;
		} else if (b[2].equals(b[5]) && b[5].equals(b[8])) {
			return true;
		} else if (b[0].equals(b[4]) && b[4].equals(b[8])) {
			return true;
		} else if (b[2].equals(b[4]) && b[4].equals(b[6])) {
			return true;
		} else {
			return false;
		}

	}

}
