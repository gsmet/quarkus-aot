package fr.spacefox.perftests.quarkus.rest.endpoint963;

import fr.spacefox.perftests.quarkus.core.service963.model.Model963;
import fr.spacefox.perftests.quarkus.rest.endpoint963.schema.Schema963;

final class Mapper {
    private Mapper() {}

    public static Schema963 of(Model963 model) {
        return new Schema963(model.id(), model.value());
    }
}
