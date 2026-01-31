package fr.spacefox.perftests.quarkus.rest.endpoint710;

import fr.spacefox.perftests.quarkus.core.service710.model.Model710;
import fr.spacefox.perftests.quarkus.rest.endpoint710.schema.Schema710;

final class Mapper {
    private Mapper() {}

    public static Schema710 of(Model710 model) {
        return new Schema710(model.id(), model.value());
    }
}
