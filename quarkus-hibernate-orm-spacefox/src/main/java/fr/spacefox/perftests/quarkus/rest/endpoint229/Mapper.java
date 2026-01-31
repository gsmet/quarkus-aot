package fr.spacefox.perftests.quarkus.rest.endpoint229;

import fr.spacefox.perftests.quarkus.core.service229.model.Model229;
import fr.spacefox.perftests.quarkus.rest.endpoint229.schema.Schema229;

final class Mapper {
    private Mapper() {}

    public static Schema229 of(Model229 model) {
        return new Schema229(model.id(), model.value());
    }
}
