package fr.spacefox.perftests.quarkus.rest.endpoint259;

import fr.spacefox.perftests.quarkus.core.service259.model.Model259;
import fr.spacefox.perftests.quarkus.rest.endpoint259.schema.Schema259;

final class Mapper {
    private Mapper() {}

    public static Schema259 of(Model259 model) {
        return new Schema259(model.id(), model.value());
    }
}
