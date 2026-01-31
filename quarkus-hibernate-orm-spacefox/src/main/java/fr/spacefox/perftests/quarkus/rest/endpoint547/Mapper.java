package fr.spacefox.perftests.quarkus.rest.endpoint547;

import fr.spacefox.perftests.quarkus.core.service547.model.Model547;
import fr.spacefox.perftests.quarkus.rest.endpoint547.schema.Schema547;

final class Mapper {
    private Mapper() {}

    public static Schema547 of(Model547 model) {
        return new Schema547(model.id(), model.value());
    }
}
