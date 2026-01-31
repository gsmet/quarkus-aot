package fr.spacefox.perftests.quarkus.rest.endpoint977;

import fr.spacefox.perftests.quarkus.core.service977.model.Model977;
import fr.spacefox.perftests.quarkus.rest.endpoint977.schema.Schema977;

final class Mapper {
    private Mapper() {}

    public static Schema977 of(Model977 model) {
        return new Schema977(model.id(), model.value());
    }
}
