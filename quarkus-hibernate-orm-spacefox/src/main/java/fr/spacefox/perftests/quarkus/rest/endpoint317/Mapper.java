package fr.spacefox.perftests.quarkus.rest.endpoint317;

import fr.spacefox.perftests.quarkus.core.service317.model.Model317;
import fr.spacefox.perftests.quarkus.rest.endpoint317.schema.Schema317;

final class Mapper {
    private Mapper() {}

    public static Schema317 of(Model317 model) {
        return new Schema317(model.id(), model.value());
    }
}
