package fr.spacefox.perftests.quarkus.rest.endpoint461;

import fr.spacefox.perftests.quarkus.core.service461.model.Model461;
import fr.spacefox.perftests.quarkus.rest.endpoint461.schema.Schema461;

final class Mapper {
    private Mapper() {}

    public static Schema461 of(Model461 model) {
        return new Schema461(model.id(), model.value());
    }
}
