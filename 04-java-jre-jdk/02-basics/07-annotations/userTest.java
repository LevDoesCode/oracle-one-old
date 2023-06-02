import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class userTest {
	public static void main(String[] args) {
		user user1 = new user("John", "12321", LocalDate.of(2010, Month.MARCH, 14));
		System.out.println(validator(user1));
	}

	public static <T> boolean validator(T object) {
		Class<?> class1 = object.getClass();
		for (Field field : class1.getDeclaredFields()) {
			if (field.isAnnotationPresent(minimumAge.class)) {
				minimumAge minAge = field.getAnnotation(minimumAge.class);
				try {
					field.setAccessible(true);
					LocalDate DOB = (LocalDate) field.get(object);
					return Period.between(DOB, LocalDate.now()).getYears() >= minAge.value();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
}
