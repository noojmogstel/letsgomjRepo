package P1;

import java.util.ArrayList;
import java.util.Scanner;

public class m1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Character> Arr = new ArrayList<Character>();
		int pizza = 0;
		int ham = 0;
		int nothing = 0;

		while (input.hasNextLine()) {
			String s = input.nextLine();

			if (s.charAt(0) == 'F') {

				if (s.charAt(2) == 'P') {
					if (Arr.contains('b') && Arr.contains('o')) {
						if (0 <= Arr.indexOf('b') && Arr.indexOf('b') < Arr.indexOf('o')) {
							Arr.remove(Arr.indexOf('b'));
							pizza++;
						} else if (0 <= Arr.indexOf('o') && Arr.indexOf('o') < Arr.indexOf('b')) {
							Arr.remove(Arr.indexOf('o'));
							pizza++;
						}
					} else if (Arr.contains('b')) {
						Arr.remove(Arr.indexOf('b'));
						pizza++;

					} else if (Arr.contains('o')) {
						Arr.remove(Arr.indexOf('o'));
						pizza++;

					} else
						Arr.add('p');

				}

				else if (s.charAt(2) == 'H') {
					if (Arr.contains('n') && Arr.contains('o')) {
						if (0 <= Arr.indexOf('n') && Arr.indexOf('n') < Arr.indexOf('o')) {
							Arr.remove(Arr.indexOf('n'));
							ham++;
						}

						else if (0 <= Arr.indexOf('o') && Arr.indexOf('o') < Arr.indexOf('n')) {
							Arr.remove(Arr.indexOf('o'));
							ham++;
						}
					} else if (Arr.contains('n')) {
						Arr.remove(Arr.indexOf('n'));
						ham++;

					} else if (Arr.contains('o')) {
						Arr.remove(Arr.indexOf('o'));
						ham++;
					} else
						Arr.add('h');

				}
			}

			if (s.charAt(0) == 'O') {
				int count = 0;
				for (int i = 0; i < Arr.size(); i++) {
					if (Arr.get(i) == 'n') {
						count++;
					} else if (Arr.get(i) == 'b') {
						count++;
					} else if (Arr.get(i) == 'o') {
						count++;
					}

				}

				if (count >= 2) {
					nothing++;

				}

				else if (s.charAt(2) == 'P') {
					if (Arr.contains('p')) {
						Arr.remove(Arr.indexOf('p'));
						pizza++;
					} else
						Arr.add('b');

				}

				else if (s.charAt(2) == 'H') {
					if (Arr.contains('h')) {
						Arr.remove(Arr.indexOf('h'));
						ham++;
					} else
						Arr.add('n');

				}

				else if (s.charAt(2) == 'A') {

					if (Arr.contains('h') && Arr.contains('p')) {
						if (0 <= Arr.indexOf('h') && Arr.indexOf('h') < Arr.indexOf('p')) {
							Arr.remove(Arr.indexOf('h'));
							ham++;
						}

						else if (0 <= Arr.indexOf('p') && Arr.indexOf('p') < Arr.indexOf('h')) {
							Arr.remove(Arr.indexOf('p'));
							pizza++;
						}

					} else if (Arr.contains('h')) {
						Arr.remove(Arr.indexOf('h'));
						ham++;
					}

					else if (Arr.contains('p')) {
						Arr.remove(Arr.indexOf('p'));
						pizza++;
					}

					else {
						
						Arr.add('o');
					}
				}

			}

			if (s.equals("E")) {
				break;
			}

		}

		
		int ct = 0;
		for (int i = 0; i < Arr.size(); i++) {
			if (Arr.get(i) == 'o' || Arr.get(i) == 'b' || Arr.get(i) == 'n') {
				ct++;
			}
		}
		nothing = nothing + ct;

		System.out.println("Pizza: " + pizza);
		System.out.println("Hamburger: " + ham);
		System.out.print("Nothing: " + nothing);
	}

}
