package fr.spacefox.perftests.quarkus.rest.endpoint382;

import fr.spacefox.perftests.quarkus.core.service382.model.Model382;
import fr.spacefox.perftests.quarkus.rest.endpoint382.schema.Schema382;

final class Mapper {
    private Mapper() {}

    public static Schema382 of(Model382 model) {
        return new Schema382(model.id(), model.value());
    }
}
