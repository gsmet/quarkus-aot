package fr.spacefox.perftests.quarkus.rest.endpoint797;

import fr.spacefox.perftests.quarkus.core.service797.model.Model797;
import fr.spacefox.perftests.quarkus.rest.endpoint797.schema.Schema797;

final class Mapper {
    private Mapper() {}

    public static Schema797 of(Model797 model) {
        return new Schema797(model.id(), model.value());
    }
}
