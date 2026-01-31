package fr.spacefox.perftests.quarkus.rest.endpoint546;

import fr.spacefox.perftests.quarkus.core.service546.model.Model546;
import fr.spacefox.perftests.quarkus.rest.endpoint546.schema.Schema546;

final class Mapper {
    private Mapper() {}

    public static Schema546 of(Model546 model) {
        return new Schema546(model.id(), model.value());
    }
}
