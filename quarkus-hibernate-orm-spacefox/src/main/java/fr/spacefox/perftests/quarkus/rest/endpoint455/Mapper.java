package fr.spacefox.perftests.quarkus.rest.endpoint455;

import fr.spacefox.perftests.quarkus.core.service455.model.Model455;
import fr.spacefox.perftests.quarkus.rest.endpoint455.schema.Schema455;

final class Mapper {
    private Mapper() {}

    public static Schema455 of(Model455 model) {
        return new Schema455(model.id(), model.value());
    }
}
