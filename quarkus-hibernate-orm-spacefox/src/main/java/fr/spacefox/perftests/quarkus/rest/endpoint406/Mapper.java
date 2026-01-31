package fr.spacefox.perftests.quarkus.rest.endpoint406;

import fr.spacefox.perftests.quarkus.core.service406.model.Model406;
import fr.spacefox.perftests.quarkus.rest.endpoint406.schema.Schema406;

final class Mapper {
    private Mapper() {}

    public static Schema406 of(Model406 model) {
        return new Schema406(model.id(), model.value());
    }
}
