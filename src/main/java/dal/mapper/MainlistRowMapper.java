package dal.mapper;

import dao.Mainlist;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MainlistRowMapper extends BeanPropertyRowMapper {

    public MainlistRowMapper(Class mappedClass) {
        super(mappedClass);
    }

    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Mainlist mainlist = new Mainlist();


        Long dbValueId = rs.getLong("ID");
        mainlist.setMainId(dbValueId);

        String dbValueName = rs.getString("NAME");
        mainlist.setName(dbValueName);

        String stringDateTime = rs.getString("DATE_TIME");
        DateTimeFormatter formatter = DateTimeFormat.forPattern("YYYY-MM-DD HH:mm:SS");
        LocalDateTime localDateTime = formatter.parseLocalDateTime(stringDateTime);
        mainlist.setDateTime(localDateTime);


        String dbValueDescription = rs.getString("DESCRIPTION");
        mainlist.setDescriotion(dbValueDescription);

        Long dbValuePeriod = rs.getLong("PERIOD");
        mainlist.setPeriod(dbValuePeriod);

        Boolean dbValueNotification = rs.getBoolean("NOTIFICATION");
        mainlist.setNotification(dbValueNotification);
       /*mainlist.setMainId(rs.getLong("ID"));
        mainlist.setName(rs.getString("NAME"));

        String stringDateTime = rs.getString("DATE_TIME");
        DateTimeFormatter formatter = DateTimeFormat.forPattern("YYYY-MM-DD HH:mm:SS");
        LocalDateTime localDateTime = formatter.parseLocalDateTime(stringDateTime);
        mainlist.setDateTime(localDateTime);

        mainlist.setDescriotion(rs.getString("Description"));
        mainlist.setImportance(rs.getBoolean("Importance"));
        mainlist.setPeriod(rs.getLong("Period"));
        mainlist.setNotification(rs.getBoolean("Notification"));*/
        return mainlist;
    }

}