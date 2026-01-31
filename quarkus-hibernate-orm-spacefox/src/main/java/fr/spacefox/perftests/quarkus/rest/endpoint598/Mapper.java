package fr.spacefox.perftests.quarkus.rest.endpoint598;

import fr.spacefox.perftests.quarkus.core.service598.model.Model598;
import fr.spacefox.perftests.quarkus.rest.endpoint598.schema.Schema598;

final class Mapper {
    private Mapper() {}

    public static Schema598 of(Model598 model) {
        return new Schema598(model.id(), model.value());
    }
}
