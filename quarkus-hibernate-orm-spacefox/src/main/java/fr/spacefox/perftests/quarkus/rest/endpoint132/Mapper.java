package fr.spacefox.perftests.quarkus.rest.endpoint132;

import fr.spacefox.perftests.quarkus.core.service132.model.Model132;
import fr.spacefox.perftests.quarkus.rest.endpoint132.schema.Schema132;

final class Mapper {
    private Mapper() {}

    public static Schema132 of(Model132 model) {
        return new Schema132(model.id(), model.value());
    }
}
