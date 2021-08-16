package om.springcloud.provider;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * 定义消息的推送管道.
 *
 * @Author: 许昊天
 * @Date: 2021/08/16/10:01
 * @Description:
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
    /**
     * 消息发送管道
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: " + serial);
        return serial;
    }
}

