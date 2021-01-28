package eu.prusaczyk.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ImageController {

    @MessageMapping("/image")
    @SendTo("/topic/images")
    public Image get(Image image) {
        return image;
    }
}
