package fr.spacefox.perftests.quarkus.rest.endpoint137;

import fr.spacefox.perftests.quarkus.core.service137.model.Model137;
import fr.spacefox.perftests.quarkus.rest.endpoint137.schema.Schema137;

final class Mapper {
    private Mapper() {}

    public static Schema137 of(Model137 model) {
        return new Schema137(model.id(), model.value());
    }
}
