package fr.spacefox.perftests.quarkus.rest.endpoint128;

import fr.spacefox.perftests.quarkus.core.service128.model.Model128;
import fr.spacefox.perftests.quarkus.rest.endpoint128.schema.Schema128;

final class Mapper {
    private Mapper() {}

    public static Schema128 of(Model128 model) {
        return new Schema128(model.id(), model.value());
    }
}
