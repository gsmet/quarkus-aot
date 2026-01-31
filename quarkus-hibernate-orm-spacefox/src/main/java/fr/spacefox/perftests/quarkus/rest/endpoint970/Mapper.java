package fr.spacefox.perftests.quarkus.rest.endpoint970;

import fr.spacefox.perftests.quarkus.core.service970.model.Model970;
import fr.spacefox.perftests.quarkus.rest.endpoint970.schema.Schema970;

final class Mapper {
    private Mapper() {}

    public static Schema970 of(Model970 model) {
        return new Schema970(model.id(), model.value());
    }
}
