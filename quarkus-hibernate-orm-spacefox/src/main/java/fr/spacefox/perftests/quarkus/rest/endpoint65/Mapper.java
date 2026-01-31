package fr.spacefox.perftests.quarkus.rest.endpoint65;

import fr.spacefox.perftests.quarkus.core.service65.model.Model65;
import fr.spacefox.perftests.quarkus.rest.endpoint65.schema.Schema65;

final class Mapper {
    private Mapper() {}

    public static Schema65 of(Model65 model) {
        return new Schema65(model.id(), model.value());
    }
}
