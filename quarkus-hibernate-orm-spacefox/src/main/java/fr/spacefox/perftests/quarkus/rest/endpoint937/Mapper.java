package fr.spacefox.perftests.quarkus.rest.endpoint937;

import fr.spacefox.perftests.quarkus.core.service937.model.Model937;
import fr.spacefox.perftests.quarkus.rest.endpoint937.schema.Schema937;

final class Mapper {
    private Mapper() {}

    public static Schema937 of(Model937 model) {
        return new Schema937(model.id(), model.value());
    }
}
