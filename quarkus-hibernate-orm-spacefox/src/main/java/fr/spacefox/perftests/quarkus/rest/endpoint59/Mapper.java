package fr.spacefox.perftests.quarkus.rest.endpoint59;

import fr.spacefox.perftests.quarkus.core.service59.model.Model59;
import fr.spacefox.perftests.quarkus.rest.endpoint59.schema.Schema59;

final class Mapper {
    private Mapper() {}

    public static Schema59 of(Model59 model) {
        return new Schema59(model.id(), model.value());
    }
}
