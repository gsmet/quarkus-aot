package fr.spacefox.perftests.quarkus.rest.endpoint125;

import fr.spacefox.perftests.quarkus.core.service125.model.Model125;
import fr.spacefox.perftests.quarkus.rest.endpoint125.schema.Schema125;

final class Mapper {
    private Mapper() {}

    public static Schema125 of(Model125 model) {
        return new Schema125(model.id(), model.value());
    }
}
