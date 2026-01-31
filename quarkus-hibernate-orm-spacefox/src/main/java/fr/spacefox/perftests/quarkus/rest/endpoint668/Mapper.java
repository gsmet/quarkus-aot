package fr.spacefox.perftests.quarkus.rest.endpoint668;

import fr.spacefox.perftests.quarkus.core.service668.model.Model668;
import fr.spacefox.perftests.quarkus.rest.endpoint668.schema.Schema668;

final class Mapper {
    private Mapper() {}

    public static Schema668 of(Model668 model) {
        return new Schema668(model.id(), model.value());
    }
}
