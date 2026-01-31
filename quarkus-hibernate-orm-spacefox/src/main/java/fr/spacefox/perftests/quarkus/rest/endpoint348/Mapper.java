package fr.spacefox.perftests.quarkus.rest.endpoint348;

import fr.spacefox.perftests.quarkus.core.service348.model.Model348;
import fr.spacefox.perftests.quarkus.rest.endpoint348.schema.Schema348;

final class Mapper {
    private Mapper() {}

    public static Schema348 of(Model348 model) {
        return new Schema348(model.id(), model.value());
    }
}
