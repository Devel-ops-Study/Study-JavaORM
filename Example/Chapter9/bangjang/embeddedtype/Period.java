package devlee.learn.springormstudy.Bangjang.Chapter9.bangjang.embeddedtype;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Embeddable
@Getter @Setter
public class Period {
    @Temporal(TemporalType.DATE)
    Date startDate;
    @Temporal(TemporalType.DATE)
    Date endDate;

    public boolean isWork(Date date) {
        return date.after(startDate) && date.before(endDate);
    }
}
