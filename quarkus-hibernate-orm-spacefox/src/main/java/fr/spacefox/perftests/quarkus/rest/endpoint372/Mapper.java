package fr.spacefox.perftests.quarkus.rest.endpoint372;

import fr.spacefox.perftests.quarkus.core.service372.model.Model372;
import fr.spacefox.perftests.quarkus.rest.endpoint372.schema.Schema372;

final class Mapper {
    private Mapper() {}

    public static Schema372 of(Model372 model) {
        return new Schema372(model.id(), model.value());
    }
}
