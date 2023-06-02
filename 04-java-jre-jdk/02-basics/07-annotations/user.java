import java.time.LocalDate;

public class user {
	private String name;
	private String id;
	@minimumAge(value = 18)
	private LocalDate DOB;

	public user(String name, String id, LocalDate dob) {
		this.name = name;
		this.id = id;
		this.DOB = dob;
	}
}
