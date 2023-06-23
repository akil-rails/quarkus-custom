package io.quarkiverse.custom.runtime;

import java.net.URI;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import io.quarkus.rest.client.reactive.QuarkusRestClientBuilder;
import io.smallrye.mutiny.Uni;

@Path("/todos")
public class Resource {
    private final Client client;

    public Resource() {
        this.client = QuarkusRestClientBuilder.newBuilder()
                .baseUri(URI.create("https://jsonplaceholder.typicode.com"))
                .build(Client.class);
    }

    @GET
    @Path("/todos/1")
    public Uni<Todo> getTodo() {
        return client.getTodo();
    }
}
