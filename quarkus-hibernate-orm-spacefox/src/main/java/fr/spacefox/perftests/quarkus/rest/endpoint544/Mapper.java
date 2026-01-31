package fr.spacefox.perftests.quarkus.rest.endpoint544;

import fr.spacefox.perftests.quarkus.core.service544.model.Model544;
import fr.spacefox.perftests.quarkus.rest.endpoint544.schema.Schema544;

final class Mapper {
    private Mapper() {}

    public static Schema544 of(Model544 model) {
        return new Schema544(model.id(), model.value());
    }
}
