package DATE_TIME_API;

import java.time.LocalTime;

public class Q5 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime after25Min = time.plusMinutes(25);
		System.out.println("Current time: " + time);
		System.out.println("Time after 25 minutes: " + after25Min);
	}

}