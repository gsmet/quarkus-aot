package fr.spacefox.perftests.quarkus.rest.endpoint20;

import fr.spacefox.perftests.quarkus.core.service20.model.Model20;
import fr.spacefox.perftests.quarkus.rest.endpoint20.schema.Schema20;

final class Mapper {
    private Mapper() {}

    public static Schema20 of(Model20 model) {
        return new Schema20(model.id(), model.value());
    }
}
