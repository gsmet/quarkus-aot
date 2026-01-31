package fr.spacefox.perftests.quarkus.rest.endpoint552;

import fr.spacefox.perftests.quarkus.core.service552.model.Model552;
import fr.spacefox.perftests.quarkus.rest.endpoint552.schema.Schema552;

final class Mapper {
    private Mapper() {}

    public static Schema552 of(Model552 model) {
        return new Schema552(model.id(), model.value());
    }
}
