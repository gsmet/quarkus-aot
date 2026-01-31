package fr.spacefox.perftests.quarkus.rest.endpoint298;

import fr.spacefox.perftests.quarkus.core.service298.model.Model298;
import fr.spacefox.perftests.quarkus.rest.endpoint298.schema.Schema298;

final class Mapper {
    private Mapper() {}

    public static Schema298 of(Model298 model) {
        return new Schema298(model.id(), model.value());
    }
}
