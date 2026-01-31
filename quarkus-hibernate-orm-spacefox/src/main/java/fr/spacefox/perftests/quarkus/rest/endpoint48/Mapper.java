package fr.spacefox.perftests.quarkus.rest.endpoint48;

import fr.spacefox.perftests.quarkus.core.service48.model.Model48;
import fr.spacefox.perftests.quarkus.rest.endpoint48.schema.Schema48;

final class Mapper {
    private Mapper() {}

    public static Schema48 of(Model48 model) {
        return new Schema48(model.id(), model.value());
    }
}
