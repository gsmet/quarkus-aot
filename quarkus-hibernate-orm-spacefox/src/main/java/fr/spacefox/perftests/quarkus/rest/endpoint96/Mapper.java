package fr.spacefox.perftests.quarkus.rest.endpoint96;

import fr.spacefox.perftests.quarkus.core.service96.model.Model96;
import fr.spacefox.perftests.quarkus.rest.endpoint96.schema.Schema96;

final class Mapper {
    private Mapper() {}

    public static Schema96 of(Model96 model) {
        return new Schema96(model.id(), model.value());
    }
}
