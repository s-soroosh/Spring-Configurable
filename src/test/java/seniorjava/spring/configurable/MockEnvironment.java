package seniorjava.spring.configurable;

import java.util.Date;

/**
 * Author: Soroosh Sarabadani
 * Date: 4/4/13
 * Time: 12:37 PM
 */
public class MockEnvironment implements Environment {
    private Date date;
    @Override
    public Date getCurrentDate() {
        return this.date;
    }

    public void setCurrentDate(Date date){
        this.date = date;
    }

}
