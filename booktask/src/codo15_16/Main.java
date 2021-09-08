package codo15_16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2020/09/22", fmt);

		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println(ldate +"の1000日後は" + str);

		LocalDate now = LocalDate.now();
		if (now.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です");
	}

		LocalDate nowp = now.plusDays(1000);
		String str2 = nowp.format(fmt);
		System.out.println(now + "の1000日後は" + str2);

	}
}
