package fr.spacefox.perftests.quarkus.rest.endpoint304;

import fr.spacefox.perftests.quarkus.core.service304.model.Model304;
import fr.spacefox.perftests.quarkus.rest.endpoint304.schema.Schema304;

final class Mapper {
    private Mapper() {}

    public static Schema304 of(Model304 model) {
        return new Schema304(model.id(), model.value());
    }
}
