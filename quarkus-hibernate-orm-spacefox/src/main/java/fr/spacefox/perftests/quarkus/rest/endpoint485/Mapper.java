package fr.spacefox.perftests.quarkus.rest.endpoint485;

import fr.spacefox.perftests.quarkus.core.service485.model.Model485;
import fr.spacefox.perftests.quarkus.rest.endpoint485.schema.Schema485;

final class Mapper {
    private Mapper() {}

    public static Schema485 of(Model485 model) {
        return new Schema485(model.id(), model.value());
    }
}
