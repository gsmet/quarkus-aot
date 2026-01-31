package fr.spacefox.perftests.quarkus.rest.endpoint289;

import fr.spacefox.perftests.quarkus.core.service289.model.Model289;
import fr.spacefox.perftests.quarkus.rest.endpoint289.schema.Schema289;

final class Mapper {
    private Mapper() {}

    public static Schema289 of(Model289 model) {
        return new Schema289(model.id(), model.value());
    }
}
