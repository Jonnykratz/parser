package com.ef;

import com.ef.model.LogEntry;

import java.sql.Timestamp;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LogParse {

    public static String matchTo(StringBuilder sb, String delimiter) {
        int x = sb.indexOf(delimiter);
        if (x == -1) {
            x = sb.length();
        }
        String ans = sb.substring(0, x);
        sb.delete(0, x + delimiter.length());
        return ans;
    }

    public static LogEntry parseEntry(String line) {
        //log
//    2017-01-01 00:00:11.763|192.168.234.82|"GET / HTTP/1.1"|200|"swcd (unknown version) CFNetwork/808.2.16 Darwin/15.6.0"
        StringBuilder sb = new StringBuilder(line);
        String dateStr = matchTo(sb, "|");
        Timestamp date = Timestamp.valueOf(dateStr);

        System.out.println("DATE: " + date);

        String ip = matchTo(sb, "|");
        System.out.println("IP: " + ip);

        matchTo(sb, "|"); //ignore |
        String statusStr = matchTo(sb, "|");
        Integer status = Integer.parseInt(statusStr);
        System.out.println("STATUS: " + status);

        return new LogEntry(ip, date, status);
    }
}
