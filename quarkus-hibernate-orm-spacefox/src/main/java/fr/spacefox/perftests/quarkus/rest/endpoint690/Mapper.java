package fr.spacefox.perftests.quarkus.rest.endpoint690;

import fr.spacefox.perftests.quarkus.core.service690.model.Model690;
import fr.spacefox.perftests.quarkus.rest.endpoint690.schema.Schema690;

final class Mapper {
    private Mapper() {}

    public static Schema690 of(Model690 model) {
        return new Schema690(model.id(), model.value());
    }
}
