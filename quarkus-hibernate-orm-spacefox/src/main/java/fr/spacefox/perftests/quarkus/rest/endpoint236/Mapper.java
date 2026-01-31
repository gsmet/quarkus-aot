package fr.spacefox.perftests.quarkus.rest.endpoint236;

import fr.spacefox.perftests.quarkus.core.service236.model.Model236;
import fr.spacefox.perftests.quarkus.rest.endpoint236.schema.Schema236;

final class Mapper {
    private Mapper() {}

    public static Schema236 of(Model236 model) {
        return new Schema236(model.id(), model.value());
    }
}
