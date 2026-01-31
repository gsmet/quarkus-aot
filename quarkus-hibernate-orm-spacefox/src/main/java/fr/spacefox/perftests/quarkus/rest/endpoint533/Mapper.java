package fr.spacefox.perftests.quarkus.rest.endpoint533;

import fr.spacefox.perftests.quarkus.core.service533.model.Model533;
import fr.spacefox.perftests.quarkus.rest.endpoint533.schema.Schema533;

final class Mapper {
    private Mapper() {}

    public static Schema533 of(Model533 model) {
        return new Schema533(model.id(), model.value());
    }
}
