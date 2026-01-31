package fr.spacefox.perftests.quarkus.rest.endpoint361;

import fr.spacefox.perftests.quarkus.core.service361.model.Model361;
import fr.spacefox.perftests.quarkus.rest.endpoint361.schema.Schema361;

final class Mapper {
    private Mapper() {}

    public static Schema361 of(Model361 model) {
        return new Schema361(model.id(), model.value());
    }
}
