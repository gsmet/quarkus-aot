package fr.spacefox.perftests.quarkus.rest.endpoint280;

import fr.spacefox.perftests.quarkus.core.service280.model.Model280;
import fr.spacefox.perftests.quarkus.rest.endpoint280.schema.Schema280;

final class Mapper {
    private Mapper() {}

    public static Schema280 of(Model280 model) {
        return new Schema280(model.id(), model.value());
    }
}
