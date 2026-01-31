package fr.spacefox.perftests.quarkus.rest.endpoint731;

import fr.spacefox.perftests.quarkus.core.service731.model.Model731;
import fr.spacefox.perftests.quarkus.rest.endpoint731.schema.Schema731;

final class Mapper {
    private Mapper() {}

    public static Schema731 of(Model731 model) {
        return new Schema731(model.id(), model.value());
    }
}
