/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonal mishra
 */
import java.text.*;

public class DOB {

    public int day;
    public int month;
    public int year;

    public boolean set(int d, int m, int y) {
        String DATE_FORMAT = "dd-MM-yyyy";
        String date = String.valueOf(d) + "-" + String.valueOf(m) + "-" + String.valueOf(y);
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
