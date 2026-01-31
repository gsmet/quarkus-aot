package fr.spacefox.perftests.quarkus.rest.endpoint827;

import fr.spacefox.perftests.quarkus.core.service827.model.Model827;
import fr.spacefox.perftests.quarkus.rest.endpoint827.schema.Schema827;

final class Mapper {
    private Mapper() {}

    public static Schema827 of(Model827 model) {
        return new Schema827(model.id(), model.value());
    }
}
