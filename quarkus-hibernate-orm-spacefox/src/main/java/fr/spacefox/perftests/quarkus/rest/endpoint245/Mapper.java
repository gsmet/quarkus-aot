package fr.spacefox.perftests.quarkus.rest.endpoint245;

import fr.spacefox.perftests.quarkus.core.service245.model.Model245;
import fr.spacefox.perftests.quarkus.rest.endpoint245.schema.Schema245;

final class Mapper {
    private Mapper() {}

    public static Schema245 of(Model245 model) {
        return new Schema245(model.id(), model.value());
    }
}
