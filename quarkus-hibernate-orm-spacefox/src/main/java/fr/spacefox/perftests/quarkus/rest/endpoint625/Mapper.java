package fr.spacefox.perftests.quarkus.rest.endpoint625;

import fr.spacefox.perftests.quarkus.core.service625.model.Model625;
import fr.spacefox.perftests.quarkus.rest.endpoint625.schema.Schema625;

final class Mapper {
    private Mapper() {}

    public static Schema625 of(Model625 model) {
        return new Schema625(model.id(), model.value());
    }
}
