package fr.spacefox.perftests.quarkus.rest.endpoint320;

import fr.spacefox.perftests.quarkus.core.service320.model.Model320;
import fr.spacefox.perftests.quarkus.rest.endpoint320.schema.Schema320;

final class Mapper {
    private Mapper() {}

    public static Schema320 of(Model320 model) {
        return new Schema320(model.id(), model.value());
    }
}
