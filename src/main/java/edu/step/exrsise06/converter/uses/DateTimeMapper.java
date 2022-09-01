package edu.step.exrsise06.converter.uses;


import edu.step.exrsise06.exception.DateTimeMapperException;
import org.mapstruct.Mapper;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import static edu.step.exrsise06.constants.Constants.DATE_PATTERN;
import static edu.step.exrsise06.constants.Constants.DATE_TIME_PATTERN;

@Mapper(componentModel = "spring")
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
