package fr.spacefox.perftests.quarkus.rest.endpoint610;

import fr.spacefox.perftests.quarkus.core.service610.model.Model610;
import fr.spacefox.perftests.quarkus.rest.endpoint610.schema.Schema610;

final class Mapper {
    private Mapper() {}

    public static Schema610 of(Model610 model) {
        return new Schema610(model.id(), model.value());
    }
}
