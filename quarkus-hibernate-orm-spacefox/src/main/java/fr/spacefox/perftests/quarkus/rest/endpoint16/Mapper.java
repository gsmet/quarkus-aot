package fr.spacefox.perftests.quarkus.rest.endpoint16;

import fr.spacefox.perftests.quarkus.core.service16.model.Model16;
import fr.spacefox.perftests.quarkus.rest.endpoint16.schema.Schema16;

final class Mapper {
    private Mapper() {}

    public static Schema16 of(Model16 model) {
        return new Schema16(model.id(), model.value());
    }
}
