package fr.spacefox.perftests.quarkus.rest.endpoint332;

import fr.spacefox.perftests.quarkus.core.service332.model.Model332;
import fr.spacefox.perftests.quarkus.rest.endpoint332.schema.Schema332;

final class Mapper {
    private Mapper() {}

    public static Schema332 of(Model332 model) {
        return new Schema332(model.id(), model.value());
    }
}
