package MVP;

import MVP.entity.Post;
import MVP.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("post", new Post());
        model.addAttribute("list", postRepository.findAll());
        return "posts";
    }

    @PostMapping("/createpost")
    public String createPost(@ModelAttribute Post post) {
        postRepository.save(post);
        return "redirect:/posts";
    }

    @PostMapping("/deletepost/{id}")
    public String delete(@PathVariable Integer id){
        postRepository.deleteById(id);
        return "redirect:/posts";
    }

}
