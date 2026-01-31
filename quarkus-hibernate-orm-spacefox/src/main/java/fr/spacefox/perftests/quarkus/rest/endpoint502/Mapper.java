package fr.spacefox.perftests.quarkus.rest.endpoint502;

import fr.spacefox.perftests.quarkus.core.service502.model.Model502;
import fr.spacefox.perftests.quarkus.rest.endpoint502.schema.Schema502;

final class Mapper {
    private Mapper() {}

    public static Schema502 of(Model502 model) {
        return new Schema502(model.id(), model.value());
    }
}
