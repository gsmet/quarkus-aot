package fr.spacefox.perftests.quarkus.rest.endpoint36;

import fr.spacefox.perftests.quarkus.core.service36.model.Model36;
import fr.spacefox.perftests.quarkus.rest.endpoint36.schema.Schema36;

final class Mapper {
    private Mapper() {}

    public static Schema36 of(Model36 model) {
        return new Schema36(model.id(), model.value());
    }
}
