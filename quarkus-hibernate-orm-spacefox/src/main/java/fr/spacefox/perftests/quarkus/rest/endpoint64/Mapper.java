package fr.spacefox.perftests.quarkus.rest.endpoint64;

import fr.spacefox.perftests.quarkus.core.service64.model.Model64;
import fr.spacefox.perftests.quarkus.rest.endpoint64.schema.Schema64;

final class Mapper {
    private Mapper() {}

    public static Schema64 of(Model64 model) {
        return new Schema64(model.id(), model.value());
    }
}
