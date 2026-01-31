package fr.spacefox.perftests.quarkus.rest.endpoint537;

import fr.spacefox.perftests.quarkus.core.service537.model.Model537;
import fr.spacefox.perftests.quarkus.rest.endpoint537.schema.Schema537;

final class Mapper {
    private Mapper() {}

    public static Schema537 of(Model537 model) {
        return new Schema537(model.id(), model.value());
    }
}
