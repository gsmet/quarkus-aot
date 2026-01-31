package fr.spacefox.perftests.quarkus.rest.endpoint481;

import fr.spacefox.perftests.quarkus.core.service481.model.Model481;
import fr.spacefox.perftests.quarkus.rest.endpoint481.schema.Schema481;

final class Mapper {
    private Mapper() {}

    public static Schema481 of(Model481 model) {
        return new Schema481(model.id(), model.value());
    }
}
