/**
 * File: If statements
 * Author: Naren Nades
 * Date Created: Mar 23, 2026
 * Date Last Modified: Apr 10, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd(int num) {
		if (num % 2 == 0){
			return "Even";
		}
		return "Odd";
	}
	
	public static String teacherOrStudent(String name) {
		if (name == "Kalisz") {
			return "Teacher";
		}
		return "Student";
	}

	public static int fartherFromZero(int num) {
		if (num > 0) {
			return num + 5;
		}
		if (num < 0) {
			return num - 5;
		}
		return num;
	}

}
