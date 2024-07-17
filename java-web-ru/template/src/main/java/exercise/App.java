package exercise;

import io.javalin.Javalin;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

import io.javalin.http.NotFoundResponse;
import exercise.model.User;
import exercise.dto.users.UserPage;
import exercise.dto.users.UsersPage;
import static io.javalin.rendering.template.TemplateUtil.model;
import io.javalin.rendering.template.JavalinJte;

public final class App {

    // Каждый пользователь представлен объектом класса User
    private static final List<User> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        // BEGIN
        app.get("/users", ctx -> {
            var header = "List of all users";
            var usersPage = new UsersPage(USERS, header);
            ctx.render("/users/index.jte", model("page", usersPage));
        });
        app.get("/users/{id}", ctx -> {
            var header = "Page of current user";
            Supplier<NotFoundResponse> notFound = () -> new NotFoundResponse("User not found");
            var id = ctx.pathParamAsClass("id", Long.class);
            User user = USERS.stream().filter(user1 -> Objects.equals(user1.getId(), id)).findFirst().orElseThrow(notFound);
            var user1 = new User(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
            var userPage = new UserPage(user1, header);
            ctx.render("/users/show.jte", Map.of("userPage", userPage));
        });
        // END

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
