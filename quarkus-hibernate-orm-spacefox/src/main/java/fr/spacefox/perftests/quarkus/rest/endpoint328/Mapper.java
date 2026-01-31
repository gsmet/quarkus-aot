package fr.spacefox.perftests.quarkus.rest.endpoint328;

import fr.spacefox.perftests.quarkus.core.service328.model.Model328;
import fr.spacefox.perftests.quarkus.rest.endpoint328.schema.Schema328;

final class Mapper {
    private Mapper() {}

    public static Schema328 of(Model328 model) {
        return new Schema328(model.id(), model.value());
    }
}
