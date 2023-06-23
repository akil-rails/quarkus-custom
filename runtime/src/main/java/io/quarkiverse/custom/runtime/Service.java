package io.quarkiverse.custom.runtime;

import jakarta.inject.Inject;

import io.smallrye.mutiny.Uni;

public class Service {
    @Inject
    Resource resource;

    public Uni<Todo> getTodo() {
        return resource.getTodo();
    }
}
