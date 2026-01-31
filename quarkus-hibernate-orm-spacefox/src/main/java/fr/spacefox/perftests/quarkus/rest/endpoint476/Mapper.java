package fr.spacefox.perftests.quarkus.rest.endpoint476;

import fr.spacefox.perftests.quarkus.core.service476.model.Model476;
import fr.spacefox.perftests.quarkus.rest.endpoint476.schema.Schema476;

final class Mapper {
    private Mapper() {}

    public static Schema476 of(Model476 model) {
        return new Schema476(model.id(), model.value());
    }
}
