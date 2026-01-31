package fr.spacefox.perftests.quarkus.rest.endpoint402;

import fr.spacefox.perftests.quarkus.core.service402.model.Model402;
import fr.spacefox.perftests.quarkus.rest.endpoint402.schema.Schema402;

final class Mapper {
    private Mapper() {}

    public static Schema402 of(Model402 model) {
        return new Schema402(model.id(), model.value());
    }
}
