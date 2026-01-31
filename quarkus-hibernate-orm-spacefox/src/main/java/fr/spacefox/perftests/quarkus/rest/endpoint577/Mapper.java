package fr.spacefox.perftests.quarkus.rest.endpoint577;

import fr.spacefox.perftests.quarkus.core.service577.model.Model577;
import fr.spacefox.perftests.quarkus.rest.endpoint577.schema.Schema577;

final class Mapper {
    private Mapper() {}

    public static Schema577 of(Model577 model) {
        return new Schema577(model.id(), model.value());
    }
}
