package fr.spacefox.perftests.quarkus.rest.endpoint844;

import fr.spacefox.perftests.quarkus.core.service844.model.Model844;
import fr.spacefox.perftests.quarkus.rest.endpoint844.schema.Schema844;

final class Mapper {
    private Mapper() {}

    public static Schema844 of(Model844 model) {
        return new Schema844(model.id(), model.value());
    }
}
