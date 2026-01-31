package fr.spacefox.perftests.quarkus.rest.endpoint621;

import fr.spacefox.perftests.quarkus.core.service621.model.Model621;
import fr.spacefox.perftests.quarkus.rest.endpoint621.schema.Schema621;

final class Mapper {
    private Mapper() {}

    public static Schema621 of(Model621 model) {
        return new Schema621(model.id(), model.value());
    }
}
