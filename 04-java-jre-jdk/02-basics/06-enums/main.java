
public class main {
	public static final String DIA_LUNES = "Lunes"; // Old way

	public static void main(String[] args) {
		for (days day : days.values()) {
			System.out.println("Day of the week: " + day);
		}
		days sunday = days.SUNDAY;
		System.out.println(sunday.name());
		System.out.println(sunday.ordinal());
		System.out.println(sunday.toString());
	}
}
