package fr.spacefox.perftests.quarkus.rest.endpoint532;

import fr.spacefox.perftests.quarkus.core.service532.model.Model532;
import fr.spacefox.perftests.quarkus.rest.endpoint532.schema.Schema532;

final class Mapper {
    private Mapper() {}

    public static Schema532 of(Model532 model) {
        return new Schema532(model.id(), model.value());
    }
}
