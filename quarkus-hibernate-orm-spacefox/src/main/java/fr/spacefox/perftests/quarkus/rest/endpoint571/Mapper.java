package fr.spacefox.perftests.quarkus.rest.endpoint571;

import fr.spacefox.perftests.quarkus.core.service571.model.Model571;
import fr.spacefox.perftests.quarkus.rest.endpoint571.schema.Schema571;

final class Mapper {
    private Mapper() {}

    public static Schema571 of(Model571 model) {
        return new Schema571(model.id(), model.value());
    }
}
