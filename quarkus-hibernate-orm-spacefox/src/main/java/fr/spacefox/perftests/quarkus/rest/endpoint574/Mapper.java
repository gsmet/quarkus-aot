package fr.spacefox.perftests.quarkus.rest.endpoint574;

import fr.spacefox.perftests.quarkus.core.service574.model.Model574;
import fr.spacefox.perftests.quarkus.rest.endpoint574.schema.Schema574;

final class Mapper {
    private Mapper() {}

    public static Schema574 of(Model574 model) {
        return new Schema574(model.id(), model.value());
    }
}
