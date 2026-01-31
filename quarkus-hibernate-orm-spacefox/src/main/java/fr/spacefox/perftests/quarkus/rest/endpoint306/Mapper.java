package fr.spacefox.perftests.quarkus.rest.endpoint306;

import fr.spacefox.perftests.quarkus.core.service306.model.Model306;
import fr.spacefox.perftests.quarkus.rest.endpoint306.schema.Schema306;

final class Mapper {
    private Mapper() {}

    public static Schema306 of(Model306 model) {
        return new Schema306(model.id(), model.value());
    }
}
