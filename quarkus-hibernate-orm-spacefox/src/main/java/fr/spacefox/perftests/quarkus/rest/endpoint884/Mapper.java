package fr.spacefox.perftests.quarkus.rest.endpoint884;

import fr.spacefox.perftests.quarkus.core.service884.model.Model884;
import fr.spacefox.perftests.quarkus.rest.endpoint884.schema.Schema884;

final class Mapper {
    private Mapper() {}

    public static Schema884 of(Model884 model) {
        return new Schema884(model.id(), model.value());
    }
}
