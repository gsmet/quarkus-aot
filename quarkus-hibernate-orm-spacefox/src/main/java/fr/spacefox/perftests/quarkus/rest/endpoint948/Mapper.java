package fr.spacefox.perftests.quarkus.rest.endpoint948;

import fr.spacefox.perftests.quarkus.core.service948.model.Model948;
import fr.spacefox.perftests.quarkus.rest.endpoint948.schema.Schema948;

final class Mapper {
    private Mapper() {}

    public static Schema948 of(Model948 model) {
        return new Schema948(model.id(), model.value());
    }
}
