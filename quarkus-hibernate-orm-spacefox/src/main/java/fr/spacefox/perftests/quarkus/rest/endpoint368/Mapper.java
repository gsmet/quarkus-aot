package fr.spacefox.perftests.quarkus.rest.endpoint368;

import fr.spacefox.perftests.quarkus.core.service368.model.Model368;
import fr.spacefox.perftests.quarkus.rest.endpoint368.schema.Schema368;

final class Mapper {
    private Mapper() {}

    public static Schema368 of(Model368 model) {
        return new Schema368(model.id(), model.value());
    }
}
