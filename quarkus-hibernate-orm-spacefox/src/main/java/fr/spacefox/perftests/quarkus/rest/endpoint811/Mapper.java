package fr.spacefox.perftests.quarkus.rest.endpoint811;

import fr.spacefox.perftests.quarkus.core.service811.model.Model811;
import fr.spacefox.perftests.quarkus.rest.endpoint811.schema.Schema811;

final class Mapper {
    private Mapper() {}

    public static Schema811 of(Model811 model) {
        return new Schema811(model.id(), model.value());
    }
}
