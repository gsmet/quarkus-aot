package fr.spacefox.perftests.quarkus.rest.endpoint588;

import fr.spacefox.perftests.quarkus.core.service588.model.Model588;
import fr.spacefox.perftests.quarkus.rest.endpoint588.schema.Schema588;

final class Mapper {
    private Mapper() {}

    public static Schema588 of(Model588 model) {
        return new Schema588(model.id(), model.value());
    }
}
