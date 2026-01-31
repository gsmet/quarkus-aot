package fr.spacefox.perftests.quarkus.rest.endpoint464;

import fr.spacefox.perftests.quarkus.core.service464.model.Model464;
import fr.spacefox.perftests.quarkus.rest.endpoint464.schema.Schema464;

final class Mapper {
    private Mapper() {}

    public static Schema464 of(Model464 model) {
        return new Schema464(model.id(), model.value());
    }
}
