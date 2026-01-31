package fr.spacefox.perftests.quarkus.rest.endpoint933;

import fr.spacefox.perftests.quarkus.core.service933.model.Model933;
import fr.spacefox.perftests.quarkus.rest.endpoint933.schema.Schema933;

final class Mapper {
    private Mapper() {}

    public static Schema933 of(Model933 model) {
        return new Schema933(model.id(), model.value());
    }
}
