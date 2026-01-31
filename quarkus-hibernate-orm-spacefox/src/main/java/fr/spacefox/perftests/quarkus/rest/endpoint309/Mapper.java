package fr.spacefox.perftests.quarkus.rest.endpoint309;

import fr.spacefox.perftests.quarkus.core.service309.model.Model309;
import fr.spacefox.perftests.quarkus.rest.endpoint309.schema.Schema309;

final class Mapper {
    private Mapper() {}

    public static Schema309 of(Model309 model) {
        return new Schema309(model.id(), model.value());
    }
}
