package om.springcloud.controller;

import om.springcloud.provider.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许昊天
 * @Date: 2021/08/16/10:18
 * @Description:
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }
}
