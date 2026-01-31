package fr.spacefox.perftests.quarkus.rest.endpoint313;

import fr.spacefox.perftests.quarkus.core.service313.model.Model313;
import fr.spacefox.perftests.quarkus.rest.endpoint313.schema.Schema313;

final class Mapper {
    private Mapper() {}

    public static Schema313 of(Model313 model) {
        return new Schema313(model.id(), model.value());
    }
}
