package fr.spacefox.perftests.quarkus.rest.endpoint363;

import fr.spacefox.perftests.quarkus.core.service363.model.Model363;
import fr.spacefox.perftests.quarkus.rest.endpoint363.schema.Schema363;

final class Mapper {
    private Mapper() {}

    public static Schema363 of(Model363 model) {
        return new Schema363(model.id(), model.value());
    }
}
