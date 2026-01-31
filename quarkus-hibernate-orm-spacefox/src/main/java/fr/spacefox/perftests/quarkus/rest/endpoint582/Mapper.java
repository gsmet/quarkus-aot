package fr.spacefox.perftests.quarkus.rest.endpoint582;

import fr.spacefox.perftests.quarkus.core.service582.model.Model582;
import fr.spacefox.perftests.quarkus.rest.endpoint582.schema.Schema582;

final class Mapper {
    private Mapper() {}

    public static Schema582 of(Model582 model) {
        return new Schema582(model.id(), model.value());
    }
}
