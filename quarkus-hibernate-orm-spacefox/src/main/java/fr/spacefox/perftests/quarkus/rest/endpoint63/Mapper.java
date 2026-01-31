package fr.spacefox.perftests.quarkus.rest.endpoint63;

import fr.spacefox.perftests.quarkus.core.service63.model.Model63;
import fr.spacefox.perftests.quarkus.rest.endpoint63.schema.Schema63;

final class Mapper {
    private Mapper() {}

    public static Schema63 of(Model63 model) {
        return new Schema63(model.id(), model.value());
    }
}
