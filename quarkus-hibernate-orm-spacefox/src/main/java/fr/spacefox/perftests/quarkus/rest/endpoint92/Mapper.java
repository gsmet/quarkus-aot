package fr.spacefox.perftests.quarkus.rest.endpoint92;

import fr.spacefox.perftests.quarkus.core.service92.model.Model92;
import fr.spacefox.perftests.quarkus.rest.endpoint92.schema.Schema92;

final class Mapper {
    private Mapper() {}

    public static Schema92 of(Model92 model) {
        return new Schema92(model.id(), model.value());
    }
}
