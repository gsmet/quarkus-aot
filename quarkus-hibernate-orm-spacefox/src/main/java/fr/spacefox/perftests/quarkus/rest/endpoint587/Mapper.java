package fr.spacefox.perftests.quarkus.rest.endpoint587;

import fr.spacefox.perftests.quarkus.core.service587.model.Model587;
import fr.spacefox.perftests.quarkus.rest.endpoint587.schema.Schema587;

final class Mapper {
    private Mapper() {}

    public static Schema587 of(Model587 model) {
        return new Schema587(model.id(), model.value());
    }
}
