// ADJUST THE PACKAGE PATH 
package kang.cahya.com.utils;

// import dependencies
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
*
* Date Time Manipulation (DTM)
*
* 
* Blog : https://www.kang-cahya.com
* Github Repository : https://github.com/dyazincahya/DTM-helper-java
* 2021 © kang cahya
*
*/

public class DTM {

    private Date now;
    private Locale locale;

    public DTM() {
        this.now = new Date();
        this.locale = new Locale("in", "ID");
    }

    public DTM(Date now) {
        this.now = now;
        this.locale = new Locale("in", "ID");
    }

    public DTM(Date now, Locale locale) {
        this.now = now;
        this.locale = locale;
    }
    
    // fill in positive numbers to add days (1,2,3, etc), and;
    // fill in negative numbers to subtract days (-1, -2, -3, etc)
    /*
        Example :
        DTM dtm = new DTM();
        dtm.day(-1).getTime();
     */
    public Calendar day(int day) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DATE, day);

        return cal;
    }

    // fill in positive numbers to add month (1,2,3, etc), and;
    // fill in negative numbers to subtract month (-1, -2, -3, etc)
    /*
        Example :
        DTM dtm = new DTM();
        dtm.month(-2).getTime();
     */
    public Calendar month(int month) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.MONTH, month);

        return cal;
    }

    // fill in positive numbers to add year (1,2,3, etc), and;
    // fill in negative numbers to subtract year (-1, -2, -3, etc)
    /*
        Example :
        DTM dtm = new DTM();
        dtm.year(-2).getTime();
     */
    public Calendar year(int year) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.YEAR, year);

        return cal;
    }

    // fill in positive numbers to add hour (1,2,3, etc), and;
    // fill in negative numbers to subtract hour (-1, -2, -3, etc)
    /*
        Example :
        DTM dtm = new DTM();
        dtm.hour(-2).getTime();
     */
    public Calendar hour(int hour) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.HOUR, hour);

        return cal;
    }

    // fill in positive numbers to add minute (1,2,3, etc), and;
    // fill in negative numbers to subtract minute (-1, -2, -3, etc)
    /*
        Example :
        DTM dtm = new DTM();
        dtm.minute(-2).getTime();
     */
    public Calendar minute(int minute) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.MINUTE, minute);

        return cal;
    }

    // fill in positive numbers to add second (1,2,3, etc), and;
    // fill in negative numbers to subtract second (-1, -2, -3, etc)
    /*
        Example :
        DTM dtm = new DTM();
        dtm.second(-2).getTime();
     */
    public Calendar second(int second) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.MINUTE, second);

        return cal;
    }

    // fill in positive numbers to add milisecond (1,2,3, etc), and;
    // fill in negative numbers to subtract milisecond (-1, -2, -3, etc)
    /*
        Example :
        DTM dtm = new DTM();
        dtm.milisecond(-2).getTime();
     */
    public Calendar milisecond(int milisecond) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.MILLISECOND, milisecond);

        return cal;
    }

    /*
        Example :
        DTM dtm = new DTM();
        dtm.reFormat(dtm.day(-1).getTime(),"ddMMyyyy");
     */
    public String reFormat(Date date, String pattern){
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, locale);

        return formatter.format(date);
    }

    /*
        Example :
        DTM dtm = new DTM();
        dtm.stringToDate("31/12/1998","dd/MM/yyyy");

        Result : Thu Dec 31 00:00:00 IST 1998
     */
    public Date stringToDate(String dateString, String pattern) throws ParseException {

        return new SimpleDateFormat(pattern, locale).parse(dateString);
    }
}
