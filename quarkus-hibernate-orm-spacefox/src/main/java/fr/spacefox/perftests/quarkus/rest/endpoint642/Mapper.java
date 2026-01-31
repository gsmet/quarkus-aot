package fr.spacefox.perftests.quarkus.rest.endpoint642;

import fr.spacefox.perftests.quarkus.core.service642.model.Model642;
import fr.spacefox.perftests.quarkus.rest.endpoint642.schema.Schema642;

final class Mapper {
    private Mapper() {}

    public static Schema642 of(Model642 model) {
        return new Schema642(model.id(), model.value());
    }
}
