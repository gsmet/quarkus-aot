package fr.spacefox.perftests.quarkus.rest.endpoint27;

import fr.spacefox.perftests.quarkus.core.service27.model.Model27;
import fr.spacefox.perftests.quarkus.rest.endpoint27.schema.Schema27;

final class Mapper {
    private Mapper() {}

    public static Schema27 of(Model27 model) {
        return new Schema27(model.id(), model.value());
    }
}
