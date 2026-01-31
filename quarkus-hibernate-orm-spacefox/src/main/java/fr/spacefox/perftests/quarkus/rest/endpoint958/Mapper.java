package fr.spacefox.perftests.quarkus.rest.endpoint958;

import fr.spacefox.perftests.quarkus.core.service958.model.Model958;
import fr.spacefox.perftests.quarkus.rest.endpoint958.schema.Schema958;

final class Mapper {
    private Mapper() {}

    public static Schema958 of(Model958 model) {
        return new Schema958(model.id(), model.value());
    }
}
