package fr.spacefox.perftests.quarkus.rest.endpoint529;

import fr.spacefox.perftests.quarkus.core.service529.model.Model529;
import fr.spacefox.perftests.quarkus.rest.endpoint529.schema.Schema529;

final class Mapper {
    private Mapper() {}

    public static Schema529 of(Model529 model) {
        return new Schema529(model.id(), model.value());
    }
}
