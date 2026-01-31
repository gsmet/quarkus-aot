package fr.spacefox.perftests.quarkus.rest.endpoint327;

import fr.spacefox.perftests.quarkus.core.service327.model.Model327;
import fr.spacefox.perftests.quarkus.rest.endpoint327.schema.Schema327;

final class Mapper {
    private Mapper() {}

    public static Schema327 of(Model327 model) {
        return new Schema327(model.id(), model.value());
    }
}
