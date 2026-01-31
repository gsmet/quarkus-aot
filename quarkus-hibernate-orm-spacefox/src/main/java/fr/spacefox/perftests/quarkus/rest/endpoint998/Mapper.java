package fr.spacefox.perftests.quarkus.rest.endpoint998;

import fr.spacefox.perftests.quarkus.core.service998.model.Model998;
import fr.spacefox.perftests.quarkus.rest.endpoint998.schema.Schema998;

final class Mapper {
    private Mapper() {}

    public static Schema998 of(Model998 model) {
        return new Schema998(model.id(), model.value());
    }
}
