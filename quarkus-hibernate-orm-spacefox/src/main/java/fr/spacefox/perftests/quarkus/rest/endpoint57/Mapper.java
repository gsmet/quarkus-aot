package fr.spacefox.perftests.quarkus.rest.endpoint57;

import fr.spacefox.perftests.quarkus.core.service57.model.Model57;
import fr.spacefox.perftests.quarkus.rest.endpoint57.schema.Schema57;

final class Mapper {
    private Mapper() {}

    public static Schema57 of(Model57 model) {
        return new Schema57(model.id(), model.value());
    }
}
