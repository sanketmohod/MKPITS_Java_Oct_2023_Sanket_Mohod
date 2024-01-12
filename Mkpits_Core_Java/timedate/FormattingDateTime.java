package com.mkpits.timedate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LocalDateTime datetime = LocalDateTime.now();
      System.out.println("Before formatting : "+datetime);
    //  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
     // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd-mm-yyyy HH:mm:ss");
      // E - is display the current day

      String pattern = datetime.format(formatter);
      System.out.println("After formatting : "+pattern);
	}

}
