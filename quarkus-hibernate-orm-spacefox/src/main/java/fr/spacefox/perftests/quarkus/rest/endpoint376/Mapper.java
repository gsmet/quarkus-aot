package fr.spacefox.perftests.quarkus.rest.endpoint376;

import fr.spacefox.perftests.quarkus.core.service376.model.Model376;
import fr.spacefox.perftests.quarkus.rest.endpoint376.schema.Schema376;

final class Mapper {
    private Mapper() {}

    public static Schema376 of(Model376 model) {
        return new Schema376(model.id(), model.value());
    }
}
