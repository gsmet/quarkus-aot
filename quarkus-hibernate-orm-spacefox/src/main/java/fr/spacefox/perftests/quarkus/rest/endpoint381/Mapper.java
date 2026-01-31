package fr.spacefox.perftests.quarkus.rest.endpoint381;

import fr.spacefox.perftests.quarkus.core.service381.model.Model381;
import fr.spacefox.perftests.quarkus.rest.endpoint381.schema.Schema381;

final class Mapper {
    private Mapper() {}

    public static Schema381 of(Model381 model) {
        return new Schema381(model.id(), model.value());
    }
}
