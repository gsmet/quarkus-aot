package fr.spacefox.perftests.quarkus.rest.endpoint880;

import fr.spacefox.perftests.quarkus.core.service880.model.Model880;
import fr.spacefox.perftests.quarkus.rest.endpoint880.schema.Schema880;

final class Mapper {
    private Mapper() {}

    public static Schema880 of(Model880 model) {
        return new Schema880(model.id(), model.value());
    }
}
