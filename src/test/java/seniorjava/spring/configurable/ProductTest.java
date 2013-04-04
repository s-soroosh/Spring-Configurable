package seniorjava.spring.configurable;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.Calendar;
import java.util.Date;

/**
 * Author: Soroosh Sarabadani
 * Date: 4/4/13
 * Time: 12:06 PM
 */
@ContextConfiguration({"classpath*:context.xml","classpath*:test-context.xml"})
public class ProductTest extends AbstractJUnit4SpringContextTests {
    final Date time = Calendar.getInstance().getTime();
    @Autowired
    Environment environment;

    @Before
    public void before() {


        ((MockEnvironment) this.environment).setCurrentDate(time);
    }

    @Test
    public void created_product_should_have_current_environment_date() {
        final Product product = new Product("", "");
        Assert.assertEquals(time, product.getCreateDate());

    }

    @Test
    public void sell_should_set_createDate_to_now(){
        final Product product = new Product("", "");
        product.sell();
        Assert.assertEquals(time, product.getSaleDate());

    }
}
