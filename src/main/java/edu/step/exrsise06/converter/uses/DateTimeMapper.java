package edu.step.exrsise06.converter.uses;


import edu.step.exrsise06.exception.DateTimeMapperException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;

import static edu.step.exrsise06.constants.Constants.DATE_PATTERN;
import static edu.step.exrsise06.constants.Constants.DATE_TIME_PATTERN;

public class DateTimeMapper {

    public String date(Date date) {
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat(DATE_TIME_PATTERN).format(date);
    }

    public Date date(String date) {
        if (date == null) {
            return null;
        }
        try {
            return new SimpleDateFormat(date.length() > 10 ? DATE_TIME_PATTERN : DATE_PATTERN).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        throw new DateTimeMapperException();
    }
}
