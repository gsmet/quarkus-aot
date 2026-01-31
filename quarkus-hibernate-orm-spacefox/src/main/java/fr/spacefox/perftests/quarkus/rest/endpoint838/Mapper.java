package fr.spacefox.perftests.quarkus.rest.endpoint838;

import fr.spacefox.perftests.quarkus.core.service838.model.Model838;
import fr.spacefox.perftests.quarkus.rest.endpoint838.schema.Schema838;

final class Mapper {
    private Mapper() {}

    public static Schema838 of(Model838 model) {
        return new Schema838(model.id(), model.value());
    }
}
