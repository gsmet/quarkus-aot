package fr.spacefox.perftests.quarkus.rest.endpoint723;

import fr.spacefox.perftests.quarkus.core.service723.model.Model723;
import fr.spacefox.perftests.quarkus.rest.endpoint723.schema.Schema723;

final class Mapper {
    private Mapper() {}

    public static Schema723 of(Model723 model) {
        return new Schema723(model.id(), model.value());
    }
}
