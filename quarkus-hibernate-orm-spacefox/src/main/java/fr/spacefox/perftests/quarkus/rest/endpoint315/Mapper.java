package fr.spacefox.perftests.quarkus.rest.endpoint315;

import fr.spacefox.perftests.quarkus.core.service315.model.Model315;
import fr.spacefox.perftests.quarkus.rest.endpoint315.schema.Schema315;

final class Mapper {
    private Mapper() {}

    public static Schema315 of(Model315 model) {
        return new Schema315(model.id(), model.value());
    }
}
