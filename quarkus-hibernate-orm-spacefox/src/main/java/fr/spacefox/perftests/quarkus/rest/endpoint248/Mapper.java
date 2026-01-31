package fr.spacefox.perftests.quarkus.rest.endpoint248;

import fr.spacefox.perftests.quarkus.core.service248.model.Model248;
import fr.spacefox.perftests.quarkus.rest.endpoint248.schema.Schema248;

final class Mapper {
    private Mapper() {}

    public static Schema248 of(Model248 model) {
        return new Schema248(model.id(), model.value());
    }
}
