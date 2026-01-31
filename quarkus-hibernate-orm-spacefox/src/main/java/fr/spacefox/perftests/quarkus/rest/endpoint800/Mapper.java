package fr.spacefox.perftests.quarkus.rest.endpoint800;

import fr.spacefox.perftests.quarkus.core.service800.model.Model800;
import fr.spacefox.perftests.quarkus.rest.endpoint800.schema.Schema800;

final class Mapper {
    private Mapper() {}

    public static Schema800 of(Model800 model) {
        return new Schema800(model.id(), model.value());
    }
}
