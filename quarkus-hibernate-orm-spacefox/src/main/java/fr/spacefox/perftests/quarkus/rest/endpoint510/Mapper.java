package fr.spacefox.perftests.quarkus.rest.endpoint510;

import fr.spacefox.perftests.quarkus.core.service510.model.Model510;
import fr.spacefox.perftests.quarkus.rest.endpoint510.schema.Schema510;

final class Mapper {
    private Mapper() {}

    public static Schema510 of(Model510 model) {
        return new Schema510(model.id(), model.value());
    }
}
