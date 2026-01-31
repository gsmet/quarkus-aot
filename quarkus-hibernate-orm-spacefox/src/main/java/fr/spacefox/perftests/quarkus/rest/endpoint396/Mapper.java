package fr.spacefox.perftests.quarkus.rest.endpoint396;

import fr.spacefox.perftests.quarkus.core.service396.model.Model396;
import fr.spacefox.perftests.quarkus.rest.endpoint396.schema.Schema396;

final class Mapper {
    private Mapper() {}

    public static Schema396 of(Model396 model) {
        return new Schema396(model.id(), model.value());
    }
}
