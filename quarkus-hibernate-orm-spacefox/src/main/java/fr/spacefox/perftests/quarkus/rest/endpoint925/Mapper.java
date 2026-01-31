package fr.spacefox.perftests.quarkus.rest.endpoint925;

import fr.spacefox.perftests.quarkus.core.service925.model.Model925;
import fr.spacefox.perftests.quarkus.rest.endpoint925.schema.Schema925;

final class Mapper {
    private Mapper() {}

    public static Schema925 of(Model925 model) {
        return new Schema925(model.id(), model.value());
    }
}
