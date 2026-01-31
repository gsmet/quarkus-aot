package fr.spacefox.perftests.quarkus.rest.endpoint400;

import fr.spacefox.perftests.quarkus.core.service400.model.Model400;
import fr.spacefox.perftests.quarkus.rest.endpoint400.schema.Schema400;

final class Mapper {
    private Mapper() {}

    public static Schema400 of(Model400 model) {
        return new Schema400(model.id(), model.value());
    }
}
