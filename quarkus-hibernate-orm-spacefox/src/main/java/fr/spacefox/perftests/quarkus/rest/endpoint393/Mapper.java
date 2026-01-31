package fr.spacefox.perftests.quarkus.rest.endpoint393;

import fr.spacefox.perftests.quarkus.core.service393.model.Model393;
import fr.spacefox.perftests.quarkus.rest.endpoint393.schema.Schema393;

final class Mapper {
    private Mapper() {}

    public static Schema393 of(Model393 model) {
        return new Schema393(model.id(), model.value());
    }
}
