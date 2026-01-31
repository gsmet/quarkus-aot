package fr.spacefox.perftests.quarkus.rest.endpoint232;

import fr.spacefox.perftests.quarkus.core.service232.model.Model232;
import fr.spacefox.perftests.quarkus.rest.endpoint232.schema.Schema232;

final class Mapper {
    private Mapper() {}

    public static Schema232 of(Model232 model) {
        return new Schema232(model.id(), model.value());
    }
}
