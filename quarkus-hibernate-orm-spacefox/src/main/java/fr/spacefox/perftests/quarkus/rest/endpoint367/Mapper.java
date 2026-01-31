package fr.spacefox.perftests.quarkus.rest.endpoint367;

import fr.spacefox.perftests.quarkus.core.service367.model.Model367;
import fr.spacefox.perftests.quarkus.rest.endpoint367.schema.Schema367;

final class Mapper {
    private Mapper() {}

    public static Schema367 of(Model367 model) {
        return new Schema367(model.id(), model.value());
    }
}
