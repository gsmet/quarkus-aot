package fr.spacefox.perftests.quarkus.rest.endpoint291;

import fr.spacefox.perftests.quarkus.core.service291.model.Model291;
import fr.spacefox.perftests.quarkus.rest.endpoint291.schema.Schema291;

final class Mapper {
    private Mapper() {}

    public static Schema291 of(Model291 model) {
        return new Schema291(model.id(), model.value());
    }
}
