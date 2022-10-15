package controller;

import domain.Post;
import repository.ConsolePostRepository;

import java.util.List;

public class ConsolePostController {
    private final ConsolePostRepository consolePostRepository;

    public ConsolePostController(ConsolePostRepository consolePostRepository) {
        this.consolePostRepository = consolePostRepository;
    }

    public List<Post> findAllPost() {
        return consolePostRepository.findAll();
    }

    public Post createPost(Post post) {
        return consolePostRepository.save(post);
    }

    public Post findOne(int id) {
        Post post = consolePostRepository.findOneById(id);
        if (post == null) System.out.println("해당하는 게시글이 없습니다.");
        return post;
    }

    public void deleteOne(int id) {
        consolePostRepository.deleteById(id);
    }
}
