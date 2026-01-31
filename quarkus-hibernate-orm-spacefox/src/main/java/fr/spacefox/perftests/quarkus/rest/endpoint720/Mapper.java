package fr.spacefox.perftests.quarkus.rest.endpoint720;

import fr.spacefox.perftests.quarkus.core.service720.model.Model720;
import fr.spacefox.perftests.quarkus.rest.endpoint720.schema.Schema720;

final class Mapper {
    private Mapper() {}

    public static Schema720 of(Model720 model) {
        return new Schema720(model.id(), model.value());
    }
}
