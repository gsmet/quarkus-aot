package fr.spacefox.perftests.quarkus.rest.endpoint480;

import fr.spacefox.perftests.quarkus.core.service480.model.Model480;
import fr.spacefox.perftests.quarkus.rest.endpoint480.schema.Schema480;

final class Mapper {
    private Mapper() {}

    public static Schema480 of(Model480 model) {
        return new Schema480(model.id(), model.value());
    }
}
