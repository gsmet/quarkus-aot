package fr.spacefox.perftests.quarkus.rest.endpoint334;

import fr.spacefox.perftests.quarkus.core.service334.model.Model334;
import fr.spacefox.perftests.quarkus.rest.endpoint334.schema.Schema334;

final class Mapper {
    private Mapper() {}

    public static Schema334 of(Model334 model) {
        return new Schema334(model.id(), model.value());
    }
}
