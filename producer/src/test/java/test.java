import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 作者：zhouqinghe
 * 日期时间：2021/1/30 10:56 下午
 * 功能描述：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@RabbitListener(queues = "scelebrate")
public class test {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void contextLoads() {
//向⼯作队列发送1千条消息
        for (int i = 0; i < 1000; i++) {

            rabbitTemplate.convertAndSend("scelebrate", "hello 我是⼩兔⼦");
        }
    }

}
