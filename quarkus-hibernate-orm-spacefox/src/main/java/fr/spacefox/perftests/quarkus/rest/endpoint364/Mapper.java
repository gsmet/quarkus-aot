package fr.spacefox.perftests.quarkus.rest.endpoint364;

import fr.spacefox.perftests.quarkus.core.service364.model.Model364;
import fr.spacefox.perftests.quarkus.rest.endpoint364.schema.Schema364;

final class Mapper {
    private Mapper() {}

    public static Schema364 of(Model364 model) {
        return new Schema364(model.id(), model.value());
    }
}
