package fr.spacefox.perftests.quarkus.rest.endpoint495;

import fr.spacefox.perftests.quarkus.core.service495.model.Model495;
import fr.spacefox.perftests.quarkus.rest.endpoint495.schema.Schema495;

final class Mapper {
    private Mapper() {}

    public static Schema495 of(Model495 model) {
        return new Schema495(model.id(), model.value());
    }
}
