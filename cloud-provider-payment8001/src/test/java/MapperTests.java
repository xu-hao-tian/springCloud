import com.springcloud.Dao.PaymentDao;
import com.springcloud.PaymentMain8001;
import com.springcloud.entities.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许昊天
 * @Date: 2021/08/03/15:33
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = PaymentMain8001.class)
public class MapperTests {
    @Resource
    private PaymentDao paymentDao;

    @Test
    public void testPaymentMapperCreate() {
        Payment payment = new Payment();
        payment.setSerial("1");
        int serial = paymentDao.create(payment);
        System.out.println(serial);
    }

    @Test
    public void testPaymentMapperSelectById() {
        Payment paymentById = paymentDao.getPaymentById((long) 1);
        System.out.println("paymentById = " + paymentById);
    }
}


