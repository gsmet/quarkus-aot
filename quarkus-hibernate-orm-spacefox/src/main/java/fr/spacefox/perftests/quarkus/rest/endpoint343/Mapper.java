package fr.spacefox.perftests.quarkus.rest.endpoint343;

import fr.spacefox.perftests.quarkus.core.service343.model.Model343;
import fr.spacefox.perftests.quarkus.rest.endpoint343.schema.Schema343;

final class Mapper {
    private Mapper() {}

    public static Schema343 of(Model343 model) {
        return new Schema343(model.id(), model.value());
    }
}
