package fr.spacefox.perftests.quarkus.rest.endpoint955;

import fr.spacefox.perftests.quarkus.core.service955.model.Model955;
import fr.spacefox.perftests.quarkus.rest.endpoint955.schema.Schema955;

final class Mapper {
    private Mapper() {}

    public static Schema955 of(Model955 model) {
        return new Schema955(model.id(), model.value());
    }
}
