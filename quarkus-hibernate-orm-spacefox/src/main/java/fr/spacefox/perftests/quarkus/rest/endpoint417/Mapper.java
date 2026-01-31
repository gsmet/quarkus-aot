package fr.spacefox.perftests.quarkus.rest.endpoint417;

import fr.spacefox.perftests.quarkus.core.service417.model.Model417;
import fr.spacefox.perftests.quarkus.rest.endpoint417.schema.Schema417;

final class Mapper {
    private Mapper() {}

    public static Schema417 of(Model417 model) {
        return new Schema417(model.id(), model.value());
    }
}
