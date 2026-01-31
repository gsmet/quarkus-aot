package fr.spacefox.perftests.quarkus.rest.endpoint487;

import fr.spacefox.perftests.quarkus.core.service487.model.Model487;
import fr.spacefox.perftests.quarkus.rest.endpoint487.schema.Schema487;

final class Mapper {
    private Mapper() {}

    public static Schema487 of(Model487 model) {
        return new Schema487(model.id(), model.value());
    }
}
