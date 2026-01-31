package fr.spacefox.perftests.quarkus.rest.endpoint864;

import fr.spacefox.perftests.quarkus.core.service864.model.Model864;
import fr.spacefox.perftests.quarkus.rest.endpoint864.schema.Schema864;

final class Mapper {
    private Mapper() {}

    public static Schema864 of(Model864 model) {
        return new Schema864(model.id(), model.value());
    }
}
