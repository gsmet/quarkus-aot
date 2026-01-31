package fr.spacefox.perftests.quarkus.rest.endpoint612;

import fr.spacefox.perftests.quarkus.core.service612.model.Model612;
import fr.spacefox.perftests.quarkus.rest.endpoint612.schema.Schema612;

final class Mapper {
    private Mapper() {}

    public static Schema612 of(Model612 model) {
        return new Schema612(model.id(), model.value());
    }
}
