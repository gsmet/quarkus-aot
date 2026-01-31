package fr.spacefox.perftests.quarkus.rest.endpoint366;

import fr.spacefox.perftests.quarkus.core.service366.model.Model366;
import fr.spacefox.perftests.quarkus.rest.endpoint366.schema.Schema366;

final class Mapper {
    private Mapper() {}

    public static Schema366 of(Model366 model) {
        return new Schema366(model.id(), model.value());
    }
}
