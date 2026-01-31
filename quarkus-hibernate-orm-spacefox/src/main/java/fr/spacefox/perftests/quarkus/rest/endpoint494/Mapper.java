package fr.spacefox.perftests.quarkus.rest.endpoint494;

import fr.spacefox.perftests.quarkus.core.service494.model.Model494;
import fr.spacefox.perftests.quarkus.rest.endpoint494.schema.Schema494;

final class Mapper {
    private Mapper() {}

    public static Schema494 of(Model494 model) {
        return new Schema494(model.id(), model.value());
    }
}
