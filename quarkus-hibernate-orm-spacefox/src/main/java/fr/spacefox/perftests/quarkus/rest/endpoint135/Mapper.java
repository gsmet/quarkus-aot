package fr.spacefox.perftests.quarkus.rest.endpoint135;

import fr.spacefox.perftests.quarkus.core.service135.model.Model135;
import fr.spacefox.perftests.quarkus.rest.endpoint135.schema.Schema135;

final class Mapper {
    private Mapper() {}

    public static Schema135 of(Model135 model) {
        return new Schema135(model.id(), model.value());
    }
}
