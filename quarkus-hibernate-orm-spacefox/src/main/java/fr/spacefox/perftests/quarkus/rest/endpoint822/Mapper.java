package fr.spacefox.perftests.quarkus.rest.endpoint822;

import fr.spacefox.perftests.quarkus.core.service822.model.Model822;
import fr.spacefox.perftests.quarkus.rest.endpoint822.schema.Schema822;

final class Mapper {
    private Mapper() {}

    public static Schema822 of(Model822 model) {
        return new Schema822(model.id(), model.value());
    }
}
