package fr.spacefox.perftests.quarkus.rest.endpoint71;

import fr.spacefox.perftests.quarkus.core.service71.model.Model71;
import fr.spacefox.perftests.quarkus.rest.endpoint71.schema.Schema71;

final class Mapper {
    private Mapper() {}

    public static Schema71 of(Model71 model) {
        return new Schema71(model.id(), model.value());
    }
}
