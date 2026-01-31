package fr.spacefox.perftests.quarkus.rest.endpoint473;

import fr.spacefox.perftests.quarkus.core.service473.model.Model473;
import fr.spacefox.perftests.quarkus.rest.endpoint473.schema.Schema473;

final class Mapper {
    private Mapper() {}

    public static Schema473 of(Model473 model) {
        return new Schema473(model.id(), model.value());
    }
}
