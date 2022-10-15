import controller.ConsolePostController;
import repository.ConsolePostRepository;
import view.ConsolePostView;

public class Main {
    public static void main(String[] args) {
        ConsolePostRepository repository = new ConsolePostRepository();
        ConsolePostController controller = new ConsolePostController(repository);
        ConsolePostView view = new ConsolePostView();
        ConsolePostApplication consolePostApplication = new ConsolePostApplication(view, controller);

        consolePostApplication.run();
    }
}
