package fr.spacefox.perftests.quarkus.rest.endpoint60;

import fr.spacefox.perftests.quarkus.core.service60.model.Model60;
import fr.spacefox.perftests.quarkus.rest.endpoint60.schema.Schema60;

final class Mapper {
    private Mapper() {}

    public static Schema60 of(Model60 model) {
        return new Schema60(model.id(), model.value());
    }
}
