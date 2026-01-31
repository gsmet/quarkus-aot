package fr.spacefox.perftests.quarkus.rest.endpoint677;

import fr.spacefox.perftests.quarkus.core.service677.model.Model677;
import fr.spacefox.perftests.quarkus.rest.endpoint677.schema.Schema677;

final class Mapper {
    private Mapper() {}

    public static Schema677 of(Model677 model) {
        return new Schema677(model.id(), model.value());
    }
}
