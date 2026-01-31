package fr.spacefox.perftests.quarkus.rest.endpoint644;

import fr.spacefox.perftests.quarkus.core.service644.model.Model644;
import fr.spacefox.perftests.quarkus.rest.endpoint644.schema.Schema644;

final class Mapper {
    private Mapper() {}

    public static Schema644 of(Model644 model) {
        return new Schema644(model.id(), model.value());
    }
}
