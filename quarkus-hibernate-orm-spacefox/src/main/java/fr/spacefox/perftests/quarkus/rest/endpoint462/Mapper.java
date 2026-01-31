package fr.spacefox.perftests.quarkus.rest.endpoint462;

import fr.spacefox.perftests.quarkus.core.service462.model.Model462;
import fr.spacefox.perftests.quarkus.rest.endpoint462.schema.Schema462;

final class Mapper {
    private Mapper() {}

    public static Schema462 of(Model462 model) {
        return new Schema462(model.id(), model.value());
    }
}
