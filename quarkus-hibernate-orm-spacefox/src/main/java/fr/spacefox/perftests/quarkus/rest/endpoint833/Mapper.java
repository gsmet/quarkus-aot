package fr.spacefox.perftests.quarkus.rest.endpoint833;

import fr.spacefox.perftests.quarkus.core.service833.model.Model833;
import fr.spacefox.perftests.quarkus.rest.endpoint833.schema.Schema833;

final class Mapper {
    private Mapper() {}

    public static Schema833 of(Model833 model) {
        return new Schema833(model.id(), model.value());
    }
}
