package fr.spacefox.perftests.quarkus.rest.endpoint159;

import fr.spacefox.perftests.quarkus.core.service159.model.Model159;
import fr.spacefox.perftests.quarkus.rest.endpoint159.schema.Schema159;

final class Mapper {
    private Mapper() {}

    public static Schema159 of(Model159 model) {
        return new Schema159(model.id(), model.value());
    }
}
