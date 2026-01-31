package fr.spacefox.perftests.quarkus.rest.endpoint653;

import fr.spacefox.perftests.quarkus.core.service653.model.Model653;
import fr.spacefox.perftests.quarkus.rest.endpoint653.schema.Schema653;

final class Mapper {
    private Mapper() {}

    public static Schema653 of(Model653 model) {
        return new Schema653(model.id(), model.value());
    }
}
