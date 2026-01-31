package fr.spacefox.perftests.quarkus.rest.endpoint639;

import fr.spacefox.perftests.quarkus.core.service639.model.Model639;
import fr.spacefox.perftests.quarkus.rest.endpoint639.schema.Schema639;

final class Mapper {
    private Mapper() {}

    public static Schema639 of(Model639 model) {
        return new Schema639(model.id(), model.value());
    }
}
