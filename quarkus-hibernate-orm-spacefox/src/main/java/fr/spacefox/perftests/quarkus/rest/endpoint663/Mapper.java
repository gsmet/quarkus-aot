package fr.spacefox.perftests.quarkus.rest.endpoint663;

import fr.spacefox.perftests.quarkus.core.service663.model.Model663;
import fr.spacefox.perftests.quarkus.rest.endpoint663.schema.Schema663;

final class Mapper {
    private Mapper() {}

    public static Schema663 of(Model663 model) {
        return new Schema663(model.id(), model.value());
    }
}
