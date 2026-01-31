package fr.spacefox.perftests.quarkus.rest.endpoint111;

import fr.spacefox.perftests.quarkus.core.service111.model.Model111;
import fr.spacefox.perftests.quarkus.rest.endpoint111.schema.Schema111;

final class Mapper {
    private Mapper() {}

    public static Schema111 of(Model111 model) {
        return new Schema111(model.id(), model.value());
    }
}
