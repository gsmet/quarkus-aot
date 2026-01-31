package fr.spacefox.perftests.quarkus.rest.endpoint130;

import fr.spacefox.perftests.quarkus.core.service130.model.Model130;
import fr.spacefox.perftests.quarkus.rest.endpoint130.schema.Schema130;

final class Mapper {
    private Mapper() {}

    public static Schema130 of(Model130 model) {
        return new Schema130(model.id(), model.value());
    }
}
