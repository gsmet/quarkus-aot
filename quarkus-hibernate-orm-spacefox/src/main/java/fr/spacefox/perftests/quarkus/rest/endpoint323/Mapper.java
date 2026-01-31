package fr.spacefox.perftests.quarkus.rest.endpoint323;

import fr.spacefox.perftests.quarkus.core.service323.model.Model323;
import fr.spacefox.perftests.quarkus.rest.endpoint323.schema.Schema323;

final class Mapper {
    private Mapper() {}

    public static Schema323 of(Model323 model) {
        return new Schema323(model.id(), model.value());
    }
}
