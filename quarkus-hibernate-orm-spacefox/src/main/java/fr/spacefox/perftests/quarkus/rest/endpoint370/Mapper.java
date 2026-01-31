package fr.spacefox.perftests.quarkus.rest.endpoint370;

import fr.spacefox.perftests.quarkus.core.service370.model.Model370;
import fr.spacefox.perftests.quarkus.rest.endpoint370.schema.Schema370;

final class Mapper {
    private Mapper() {}

    public static Schema370 of(Model370 model) {
        return new Schema370(model.id(), model.value());
    }
}
