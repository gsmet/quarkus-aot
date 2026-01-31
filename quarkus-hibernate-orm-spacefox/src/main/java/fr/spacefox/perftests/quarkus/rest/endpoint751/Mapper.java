package fr.spacefox.perftests.quarkus.rest.endpoint751;

import fr.spacefox.perftests.quarkus.core.service751.model.Model751;
import fr.spacefox.perftests.quarkus.rest.endpoint751.schema.Schema751;

final class Mapper {
    private Mapper() {}

    public static Schema751 of(Model751 model) {
        return new Schema751(model.id(), model.value());
    }
}
