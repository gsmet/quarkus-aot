package fr.spacefox.perftests.quarkus.rest.endpoint967;

import fr.spacefox.perftests.quarkus.core.service967.model.Model967;
import fr.spacefox.perftests.quarkus.rest.endpoint967.schema.Schema967;

final class Mapper {
    private Mapper() {}

    public static Schema967 of(Model967 model) {
        return new Schema967(model.id(), model.value());
    }
}
