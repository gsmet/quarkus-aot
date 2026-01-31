package fr.spacefox.perftests.quarkus.rest.endpoint409;

import fr.spacefox.perftests.quarkus.core.service409.model.Model409;
import fr.spacefox.perftests.quarkus.rest.endpoint409.schema.Schema409;

final class Mapper {
    private Mapper() {}

    public static Schema409 of(Model409 model) {
        return new Schema409(model.id(), model.value());
    }
}
