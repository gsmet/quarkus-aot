package fr.spacefox.perftests.quarkus.rest.endpoint646;

import fr.spacefox.perftests.quarkus.core.service646.model.Model646;
import fr.spacefox.perftests.quarkus.rest.endpoint646.schema.Schema646;

final class Mapper {
    private Mapper() {}

    public static Schema646 of(Model646 model) {
        return new Schema646(model.id(), model.value());
    }
}
