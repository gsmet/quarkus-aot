package fr.spacefox.perftests.quarkus.rest.endpoint337;

import fr.spacefox.perftests.quarkus.core.service337.model.Model337;
import fr.spacefox.perftests.quarkus.rest.endpoint337.schema.Schema337;

final class Mapper {
    private Mapper() {}

    public static Schema337 of(Model337 model) {
        return new Schema337(model.id(), model.value());
    }
}
