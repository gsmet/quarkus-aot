package fr.spacefox.perftests.quarkus.rest.endpoint411;

import fr.spacefox.perftests.quarkus.core.service411.model.Model411;
import fr.spacefox.perftests.quarkus.rest.endpoint411.schema.Schema411;

final class Mapper {
    private Mapper() {}

    public static Schema411 of(Model411 model) {
        return new Schema411(model.id(), model.value());
    }
}
