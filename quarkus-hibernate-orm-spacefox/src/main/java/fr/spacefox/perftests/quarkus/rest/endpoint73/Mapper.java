package fr.spacefox.perftests.quarkus.rest.endpoint73;

import fr.spacefox.perftests.quarkus.core.service73.model.Model73;
import fr.spacefox.perftests.quarkus.rest.endpoint73.schema.Schema73;

final class Mapper {
    private Mapper() {}

    public static Schema73 of(Model73 model) {
        return new Schema73(model.id(), model.value());
    }
}
