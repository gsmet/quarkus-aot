package fr.spacefox.perftests.quarkus.rest.endpoint486;

import fr.spacefox.perftests.quarkus.core.service486.model.Model486;
import fr.spacefox.perftests.quarkus.rest.endpoint486.schema.Schema486;

final class Mapper {
    private Mapper() {}

    public static Schema486 of(Model486 model) {
        return new Schema486(model.id(), model.value());
    }
}
