package fr.spacefox.perftests.quarkus.rest.endpoint670;

import fr.spacefox.perftests.quarkus.core.service670.model.Model670;
import fr.spacefox.perftests.quarkus.rest.endpoint670.schema.Schema670;

final class Mapper {
    private Mapper() {}

    public static Schema670 of(Model670 model) {
        return new Schema670(model.id(), model.value());
    }
}
