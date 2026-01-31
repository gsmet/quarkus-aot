package fr.spacefox.perftests.quarkus.rest.endpoint504;

import fr.spacefox.perftests.quarkus.core.service504.model.Model504;
import fr.spacefox.perftests.quarkus.rest.endpoint504.schema.Schema504;

final class Mapper {
    private Mapper() {}

    public static Schema504 of(Model504 model) {
        return new Schema504(model.id(), model.value());
    }
}
