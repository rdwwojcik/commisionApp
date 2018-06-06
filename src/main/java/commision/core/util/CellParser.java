package commision.core.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by radoslaw.wojcik on 2017-10-19.
 */
public class CellParser {

    public static Date parseYearMonthToDate(String value){
        Integer year = Integer.parseInt(value.substring(0,4));
        Integer month = Integer.parseInt(value.substring(4,6));

        LocalDate date = LocalDate.of(year, month, 1);

        return new Date().from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static Date parseStringToDate(String value){
        DateFormat format;
        if(value.length() == 0)
            return null;

        if(value.contains("."))
            format = new SimpleDateFormat("dd.mm.yyyy");
        else
            format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return format.parse(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Double parseStringToDouble(String value){
        if(value.length() == 0 || value == null)
            return null;
        if(value.contains("%"))
            return parsePercentToDouble(value);
        return Double.parseDouble(value.replace(",","."));
    }

    private static Double parsePercentToDouble(String value){
        String result = value.replace("%","")
                             .replace(",",".");
        return Double.parseDouble(result)/100;
    }

    public static Integer parseStringToInt(String value){
        if(value.length() == 0 || value == null)
            return null;
        String result = value.replace(",00","");
        return Integer.parseInt(result);
    }

    public static Long parseStringToLong(String value){
        if (value.length() == 0)
            return null;
        String result = value.replace(",00","")
                .replace(".","");
        return Long.parseLong(result);
    }
}
