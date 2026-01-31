package fr.spacefox.perftests.quarkus.rest.endpoint460;

import fr.spacefox.perftests.quarkus.core.service460.model.Model460;
import fr.spacefox.perftests.quarkus.rest.endpoint460.schema.Schema460;

final class Mapper {
    private Mapper() {}

    public static Schema460 of(Model460 model) {
        return new Schema460(model.id(), model.value());
    }
}
