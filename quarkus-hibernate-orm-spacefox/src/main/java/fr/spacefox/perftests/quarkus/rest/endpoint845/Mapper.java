package fr.spacefox.perftests.quarkus.rest.endpoint845;

import fr.spacefox.perftests.quarkus.core.service845.model.Model845;
import fr.spacefox.perftests.quarkus.rest.endpoint845.schema.Schema845;

final class Mapper {
    private Mapper() {}

    public static Schema845 of(Model845 model) {
        return new Schema845(model.id(), model.value());
    }
}
