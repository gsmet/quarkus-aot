package fr.spacefox.perftests.quarkus.rest.endpoint946;

import fr.spacefox.perftests.quarkus.core.service946.model.Model946;
import fr.spacefox.perftests.quarkus.rest.endpoint946.schema.Schema946;

final class Mapper {
    private Mapper() {}

    public static Schema946 of(Model946 model) {
        return new Schema946(model.id(), model.value());
    }
}
