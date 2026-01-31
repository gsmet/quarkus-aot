package fr.spacefox.perftests.quarkus.rest.endpoint377;

import fr.spacefox.perftests.quarkus.core.service377.model.Model377;
import fr.spacefox.perftests.quarkus.rest.endpoint377.schema.Schema377;

final class Mapper {
    private Mapper() {}

    public static Schema377 of(Model377 model) {
        return new Schema377(model.id(), model.value());
    }
}
