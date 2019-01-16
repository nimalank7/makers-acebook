package MVP;

import MVP.entity.Post;
import MVP.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostsController {
    private final PostRepository postRepository;

    @Autowired
    public PostsController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/")
    @ResponseBody
    public String Hello() {
        return "Hello World!";
    }

    @GetMapping("/posts")
    public String displayPosts(Model model) {
        model.addAttribute("list", postRepository.findAll());
        return "posts";
    }

    @PostMapping("/newPost")
    public String newPost(Post post) {
        postRepository.save(post);
        return "redirect:/posts";
    }

}
