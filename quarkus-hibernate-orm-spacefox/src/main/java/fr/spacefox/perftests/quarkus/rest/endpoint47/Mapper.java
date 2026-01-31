package fr.spacefox.perftests.quarkus.rest.endpoint47;

import fr.spacefox.perftests.quarkus.core.service47.model.Model47;
import fr.spacefox.perftests.quarkus.rest.endpoint47.schema.Schema47;

final class Mapper {
    private Mapper() {}

    public static Schema47 of(Model47 model) {
        return new Schema47(model.id(), model.value());
    }
}
