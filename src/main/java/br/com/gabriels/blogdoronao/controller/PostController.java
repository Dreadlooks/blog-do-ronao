package br.com.gabriels.blogdoronao.controller;

import br.com.gabriels.blogdoronao.model.NewPostForm;
import br.com.gabriels.blogdoronao.model.PostOutputDto;
import br.com.gabriels.blogdoronao.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping
    public String allPosts(Model model) {
        model.addAttribute("posts", postRepository.findAll().stream().map(PostOutputDto::new).collect(Collectors.toList()));
        return "/post/posts";
    }

    @GetMapping("/new")
    public String newPostForm(NewPostForm newPostForm) {
        return "/post/new-post";
    }

    @PostMapping("/new")
    public String newPost(@Valid NewPostForm newPostForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return newPostForm(newPostForm);
        }

        postRepository.save(newPostForm.toModel());
        return allPosts(model);
    }
}
