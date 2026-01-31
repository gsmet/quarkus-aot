package fr.spacefox.perftests.quarkus.rest.endpoint31;

import fr.spacefox.perftests.quarkus.core.service31.model.Model31;
import fr.spacefox.perftests.quarkus.rest.endpoint31.schema.Schema31;

final class Mapper {
    private Mapper() {}

    public static Schema31 of(Model31 model) {
        return new Schema31(model.id(), model.value());
    }
}
