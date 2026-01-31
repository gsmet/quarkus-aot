package fr.spacefox.perftests.quarkus.rest.endpoint58;

import fr.spacefox.perftests.quarkus.core.service58.model.Model58;
import fr.spacefox.perftests.quarkus.rest.endpoint58.schema.Schema58;

final class Mapper {
    private Mapper() {}

    public static Schema58 of(Model58 model) {
        return new Schema58(model.id(), model.value());
    }
}
