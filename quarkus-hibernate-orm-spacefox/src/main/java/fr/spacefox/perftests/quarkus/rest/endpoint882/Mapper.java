package fr.spacefox.perftests.quarkus.rest.endpoint882;

import fr.spacefox.perftests.quarkus.core.service882.model.Model882;
import fr.spacefox.perftests.quarkus.rest.endpoint882.schema.Schema882;

final class Mapper {
    private Mapper() {}

    public static Schema882 of(Model882 model) {
        return new Schema882(model.id(), model.value());
    }
}
