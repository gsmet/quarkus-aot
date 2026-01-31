package fr.spacefox.perftests.quarkus.rest.endpoint924;

import fr.spacefox.perftests.quarkus.core.service924.model.Model924;
import fr.spacefox.perftests.quarkus.rest.endpoint924.schema.Schema924;

final class Mapper {
    private Mapper() {}

    public static Schema924 of(Model924 model) {
        return new Schema924(model.id(), model.value());
    }
}
