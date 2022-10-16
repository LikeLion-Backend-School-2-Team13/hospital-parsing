package controller;

import domain.Post;
import repository.ConsolePostRepository;
import service.ConsolePostService;

import java.util.List;

public class ConsolePostController {
    private final ConsolePostService consolePostService;

    public ConsolePostController(ConsolePostService consolePostService) {
        this.consolePostService = consolePostService;
    }

    public List<Post> findAllPost() {
        return consolePostService.findAllPost();
    }

    public Post createPost(Post post) {
        return consolePostService.createPost(post);
    }

    public Post findOne(int id) {
        Post post = consolePostService.findOne(id);
        return post;
    }

    public void deleteOne(int id) {
        consolePostService.deleteOne(id);
    }
}
