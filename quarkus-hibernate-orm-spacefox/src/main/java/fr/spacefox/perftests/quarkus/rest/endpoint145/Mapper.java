package fr.spacefox.perftests.quarkus.rest.endpoint145;

import fr.spacefox.perftests.quarkus.core.service145.model.Model145;
import fr.spacefox.perftests.quarkus.rest.endpoint145.schema.Schema145;

final class Mapper {
    private Mapper() {}

    public static Schema145 of(Model145 model) {
        return new Schema145(model.id(), model.value());
    }
}
