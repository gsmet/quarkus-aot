package fr.spacefox.perftests.quarkus.rest.endpoint584;

import fr.spacefox.perftests.quarkus.core.service584.model.Model584;
import fr.spacefox.perftests.quarkus.rest.endpoint584.schema.Schema584;

final class Mapper {
    private Mapper() {}

    public static Schema584 of(Model584 model) {
        return new Schema584(model.id(), model.value());
    }
}
