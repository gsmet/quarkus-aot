package fr.spacefox.perftests.quarkus.rest.endpoint67;

import fr.spacefox.perftests.quarkus.core.service67.model.Model67;
import fr.spacefox.perftests.quarkus.rest.endpoint67.schema.Schema67;

final class Mapper {
    private Mapper() {}

    public static Schema67 of(Model67 model) {
        return new Schema67(model.id(), model.value());
    }
}
