package fr.spacefox.perftests.quarkus.rest.endpoint957;

import fr.spacefox.perftests.quarkus.core.service957.model.Model957;
import fr.spacefox.perftests.quarkus.rest.endpoint957.schema.Schema957;

final class Mapper {
    private Mapper() {}

    public static Schema957 of(Model957 model) {
        return new Schema957(model.id(), model.value());
    }
}
