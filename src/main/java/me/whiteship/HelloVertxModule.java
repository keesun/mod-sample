package me.whiteship;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServer;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.core.http.HttpServerResponse;
import org.vertx.java.deploy.Verticle;

/**
 * @author Keesun Baik
 */
public class HelloVertxModule extends Verticle {

    @Override
    public void start() throws Exception {
        HttpServer server = vertx.createHttpServer();
        server.requestHandler(new Handler<HttpServerRequest>() {
            public void handle(HttpServerRequest request) {
                request.response.end("Hello Vert.x");
            }
        });
        System.out.println("server is running on http://localhost:9090/");
        server.listen(9090);
    }
}
