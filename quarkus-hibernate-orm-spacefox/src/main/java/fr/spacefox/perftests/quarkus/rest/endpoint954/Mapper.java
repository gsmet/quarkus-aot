package fr.spacefox.perftests.quarkus.rest.endpoint954;

import fr.spacefox.perftests.quarkus.core.service954.model.Model954;
import fr.spacefox.perftests.quarkus.rest.endpoint954.schema.Schema954;

final class Mapper {
    private Mapper() {}

    public static Schema954 of(Model954 model) {
        return new Schema954(model.id(), model.value());
    }
}
