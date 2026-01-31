package fr.spacefox.perftests.quarkus.rest.endpoint339;

import fr.spacefox.perftests.quarkus.core.service339.model.Model339;
import fr.spacefox.perftests.quarkus.rest.endpoint339.schema.Schema339;

final class Mapper {
    private Mapper() {}

    public static Schema339 of(Model339 model) {
        return new Schema339(model.id(), model.value());
    }
}
