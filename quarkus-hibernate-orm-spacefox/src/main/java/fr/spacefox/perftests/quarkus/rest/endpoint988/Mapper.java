package fr.spacefox.perftests.quarkus.rest.endpoint988;

import fr.spacefox.perftests.quarkus.core.service988.model.Model988;
import fr.spacefox.perftests.quarkus.rest.endpoint988.schema.Schema988;

final class Mapper {
    private Mapper() {}

    public static Schema988 of(Model988 model) {
        return new Schema988(model.id(), model.value());
    }
}
