package io.quarkiverse.custom.runtime;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import io.smallrye.mutiny.Uni;

@Path("/todos")
public interface Client {
    @GET
    Uni<Todo> getTodo();
}
