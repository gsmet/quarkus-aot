package fr.spacefox.perftests.quarkus.rest.endpoint290;

import fr.spacefox.perftests.quarkus.core.service290.model.Model290;
import fr.spacefox.perftests.quarkus.rest.endpoint290.schema.Schema290;

final class Mapper {
    private Mapper() {}

    public static Schema290 of(Model290 model) {
        return new Schema290(model.id(), model.value());
    }
}
