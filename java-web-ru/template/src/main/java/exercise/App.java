package exercise;

import exercise.dto.users.UserPage;
import exercise.dto.users.UsersPage;
import exercise.model.User;
import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;
import io.javalin.rendering.template.JavalinJte;

import java.util.Collections;
import java.util.List;

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
            UsersPage page = new UsersPage(USERS);
            ctx.render("users/index.jte", Collections.singletonMap("page", page));
        });


        app.get("users/{id}", ctx -> {
            int id = Integer.parseInt(ctx.pathParam("id"));
            User user = USERS.stream()
                    .filter(u -> u.getId() == id)
                    .findFirst()
                    .orElse(null);

            if (user == null) {
                throw new NotFoundResponse("User not found");
            } else {
                UserPage page = new UserPage(user);
                ctx.render("users/show.jte", Collections.singletonMap("page", page));
            }
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
