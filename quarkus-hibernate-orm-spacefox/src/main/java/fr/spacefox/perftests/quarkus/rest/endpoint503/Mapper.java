package fr.spacefox.perftests.quarkus.rest.endpoint503;

import fr.spacefox.perftests.quarkus.core.service503.model.Model503;
import fr.spacefox.perftests.quarkus.rest.endpoint503.schema.Schema503;

final class Mapper {
    private Mapper() {}

    public static Schema503 of(Model503 model) {
        return new Schema503(model.id(), model.value());
    }
}
