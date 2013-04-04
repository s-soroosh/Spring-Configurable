package seniorjava.spring.configurable;

import java.util.Date;

/**
 * Author: Soroosh Sarabadani
 * Date: 4/4/13
 * Time: 11:57 AM
 */
 public class DefaultEnvironment implements Environment {
    @Override
    public Date getCurrentDate() {
        return new Date();
    }
}
