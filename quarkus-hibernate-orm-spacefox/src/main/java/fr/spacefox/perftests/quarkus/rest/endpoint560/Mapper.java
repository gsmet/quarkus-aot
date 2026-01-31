package fr.spacefox.perftests.quarkus.rest.endpoint560;

import fr.spacefox.perftests.quarkus.core.service560.model.Model560;
import fr.spacefox.perftests.quarkus.rest.endpoint560.schema.Schema560;

final class Mapper {
    private Mapper() {}

    public static Schema560 of(Model560 model) {
        return new Schema560(model.id(), model.value());
    }
}
