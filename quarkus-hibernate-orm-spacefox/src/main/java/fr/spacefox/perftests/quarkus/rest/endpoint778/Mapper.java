package fr.spacefox.perftests.quarkus.rest.endpoint778;

import fr.spacefox.perftests.quarkus.core.service778.model.Model778;
import fr.spacefox.perftests.quarkus.rest.endpoint778.schema.Schema778;

final class Mapper {
    private Mapper() {}

    public static Schema778 of(Model778 model) {
        return new Schema778(model.id(), model.value());
    }
}
