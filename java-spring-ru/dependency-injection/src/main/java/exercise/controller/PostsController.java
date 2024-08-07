package exercise.controller;

import exercise.exception.ResourceNotFoundException;
import exercise.model.Post;
import exercise.repository.CommentRepository;
import exercise.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// BEGIN
@RestController
@RequestMapping("/posts")
public class PostsController {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private CommentRepository commentRepository;

    public static void main(String[] args) {
        SpringApplication.run(exercise.Application.class, args);
    }

    // BEGIN
    @GetMapping(path = "") // список всех постов
    public List<Post> index() {
        return postRepository.findAll();
    }
    @GetMapping(path = "/{id}") // просмотр конкретного поста
    public Post show(@PathVariable long id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post with id " + id + " not found"));
    }
    @PostMapping(path = "") // создание нового поста
    @ResponseStatus(HttpStatus.CREATED)
    public Post create(@RequestBody Post post) {
        return postRepository.save(post);
    }
    @PutMapping(path = "/{id}") // Обновление страницы
    public Post update(@PathVariable long id, @RequestBody Post data) {
        var post = postRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post with id " + id + " not found"));

        post.setBody(data.getBody());
        post.setTitle(data.getTitle());

        return postRepository.save(post);
    }
    @DeleteMapping(path = "/{id}") // удаление поста
    public void delete(@PathVariable long id) {
        postRepository.deleteById(id);
        commentRepository.deleteByPostId(id);
    }
    // END
}
// END
