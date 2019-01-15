package MVP;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsController {
    @GetMapping("/")
    @ResponseBody
    public String Hello() {
        return "Hello World!";
    }

    @GetMapping("/posts")
    public String displayPosts() {
        return "posts";
    }

}
