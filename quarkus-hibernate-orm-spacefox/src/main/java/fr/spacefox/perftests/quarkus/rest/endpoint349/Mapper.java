package fr.spacefox.perftests.quarkus.rest.endpoint349;

import fr.spacefox.perftests.quarkus.core.service349.model.Model349;
import fr.spacefox.perftests.quarkus.rest.endpoint349.schema.Schema349;

final class Mapper {
    private Mapper() {}

    public static Schema349 of(Model349 model) {
        return new Schema349(model.id(), model.value());
    }
}
