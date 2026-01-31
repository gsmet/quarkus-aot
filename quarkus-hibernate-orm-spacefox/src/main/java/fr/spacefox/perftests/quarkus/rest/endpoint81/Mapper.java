package fr.spacefox.perftests.quarkus.rest.endpoint81;

import fr.spacefox.perftests.quarkus.core.service81.model.Model81;
import fr.spacefox.perftests.quarkus.rest.endpoint81.schema.Schema81;

final class Mapper {
    private Mapper() {}

    public static Schema81 of(Model81 model) {
        return new Schema81(model.id(), model.value());
    }
}
