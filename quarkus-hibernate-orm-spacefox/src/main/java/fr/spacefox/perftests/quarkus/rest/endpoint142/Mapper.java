package fr.spacefox.perftests.quarkus.rest.endpoint142;

import fr.spacefox.perftests.quarkus.core.service142.model.Model142;
import fr.spacefox.perftests.quarkus.rest.endpoint142.schema.Schema142;

final class Mapper {
    private Mapper() {}

    public static Schema142 of(Model142 model) {
        return new Schema142(model.id(), model.value());
    }
}
