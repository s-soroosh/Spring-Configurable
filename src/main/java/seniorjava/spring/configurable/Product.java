package seniorjava.spring.configurable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import java.util.Date;

/**
 * Author: Soroosh Sarabadani
 * Date: 4/4/13
 * Time: 11:56 AM
 */
@Configurable(preConstruction = true)
public class Product {
    private final String name;
    private final String description;
    private final Date createDate;
    private Status status;
    private Date saleDate;
    @Autowired
    private Environment environment;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
        this.status = Status.PENDING;
        this.createDate = environment.getCurrentDate();
    }

    public void sell() {
        this.status = Status.SALE;
        this.saleDate = environment.getCurrentDate();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public static enum Status {
        PENDING, SALE;
    }
}
