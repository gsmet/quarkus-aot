package fr.spacefox.perftests.quarkus.rest.endpoint235;

import fr.spacefox.perftests.quarkus.core.service235.model.Model235;
import fr.spacefox.perftests.quarkus.rest.endpoint235.schema.Schema235;

final class Mapper {
    private Mapper() {}

    public static Schema235 of(Model235 model) {
        return new Schema235(model.id(), model.value());
    }
}
