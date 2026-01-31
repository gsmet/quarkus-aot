package fr.spacefox.perftests.quarkus.rest.endpoint21;

import fr.spacefox.perftests.quarkus.core.service21.model.Model21;
import fr.spacefox.perftests.quarkus.rest.endpoint21.schema.Schema21;

final class Mapper {
    private Mapper() {}

    public static Schema21 of(Model21 model) {
        return new Schema21(model.id(), model.value());
    }
}
