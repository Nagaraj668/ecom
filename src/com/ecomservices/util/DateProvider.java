package com.ecomservices.util;

import java.sql.Date;
import java.util.Calendar;

public class DateProvider {

	public static Date today() {
		Calendar cal = Calendar.getInstance();
		return new java.sql.Date(cal.getTimeInMillis());
	}
}
