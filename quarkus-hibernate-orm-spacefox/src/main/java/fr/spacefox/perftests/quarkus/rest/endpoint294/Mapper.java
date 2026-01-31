package fr.spacefox.perftests.quarkus.rest.endpoint294;

import fr.spacefox.perftests.quarkus.core.service294.model.Model294;
import fr.spacefox.perftests.quarkus.rest.endpoint294.schema.Schema294;

final class Mapper {
    private Mapper() {}

    public static Schema294 of(Model294 model) {
        return new Schema294(model.id(), model.value());
    }
}
