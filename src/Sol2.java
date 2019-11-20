
public class Sol2 {

	public static void main(String[] args) {
		System.out.println(ballonString("BABLOO"));
	}

	static int totalInteration = 0;
	private static int ballonString(String s) {
		while(true) {
			int initialLength = s.length();
			s = s.replaceFirst("B", "")
					.replaceFirst("A", "")
					.replaceFirst("L", "")
					.replaceFirst("L", "")
					.replaceFirst("O", "")
					.replaceFirst("O", "")
					.replaceFirst("N", "");
			if(s.length() == initialLength - 7) {
				totalInteration++;
			} else {
				break;
			}
		}
		return totalInteration;
	}
}
