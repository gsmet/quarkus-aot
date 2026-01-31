package fr.spacefox.perftests.quarkus.rest.endpoint218;

import fr.spacefox.perftests.quarkus.core.service218.model.Model218;
import fr.spacefox.perftests.quarkus.rest.endpoint218.schema.Schema218;

final class Mapper {
    private Mapper() {}

    public static Schema218 of(Model218 model) {
        return new Schema218(model.id(), model.value());
    }
}
