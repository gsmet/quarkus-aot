package fr.spacefox.perftests.quarkus.rest.endpoint432;

import fr.spacefox.perftests.quarkus.core.service432.model.Model432;
import fr.spacefox.perftests.quarkus.rest.endpoint432.schema.Schema432;

final class Mapper {
    private Mapper() {}

    public static Schema432 of(Model432 model) {
        return new Schema432(model.id(), model.value());
    }
}
