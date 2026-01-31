package fr.spacefox.perftests.quarkus.rest.endpoint387;

import fr.spacefox.perftests.quarkus.core.service387.model.Model387;
import fr.spacefox.perftests.quarkus.rest.endpoint387.schema.Schema387;

final class Mapper {
    private Mapper() {}

    public static Schema387 of(Model387 model) {
        return new Schema387(model.id(), model.value());
    }
}
