package fr.spacefox.perftests.quarkus.rest.endpoint525;

import fr.spacefox.perftests.quarkus.core.service525.model.Model525;
import fr.spacefox.perftests.quarkus.rest.endpoint525.schema.Schema525;

final class Mapper {
    private Mapper() {}

    public static Schema525 of(Model525 model) {
        return new Schema525(model.id(), model.value());
    }
}
