package fr.spacefox.perftests.quarkus.rest.endpoint79;

import fr.spacefox.perftests.quarkus.core.service79.model.Model79;
import fr.spacefox.perftests.quarkus.rest.endpoint79.schema.Schema79;

final class Mapper {
    private Mapper() {}

    public static Schema79 of(Model79 model) {
        return new Schema79(model.id(), model.value());
    }
}
