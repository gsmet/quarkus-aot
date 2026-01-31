package fr.spacefox.perftests.quarkus.rest.endpoint265;

import fr.spacefox.perftests.quarkus.core.service265.model.Model265;
import fr.spacefox.perftests.quarkus.rest.endpoint265.schema.Schema265;

final class Mapper {
    private Mapper() {}

    public static Schema265 of(Model265 model) {
        return new Schema265(model.id(), model.value());
    }
}
