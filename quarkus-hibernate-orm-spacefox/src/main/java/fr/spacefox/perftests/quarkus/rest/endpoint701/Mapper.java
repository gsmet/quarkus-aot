package fr.spacefox.perftests.quarkus.rest.endpoint701;

import fr.spacefox.perftests.quarkus.core.service701.model.Model701;
import fr.spacefox.perftests.quarkus.rest.endpoint701.schema.Schema701;

final class Mapper {
    private Mapper() {}

    public static Schema701 of(Model701 model) {
        return new Schema701(model.id(), model.value());
    }
}
