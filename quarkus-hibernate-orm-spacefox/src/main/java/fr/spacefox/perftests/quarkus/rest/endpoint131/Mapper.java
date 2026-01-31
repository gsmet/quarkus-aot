package fr.spacefox.perftests.quarkus.rest.endpoint131;

import fr.spacefox.perftests.quarkus.core.service131.model.Model131;
import fr.spacefox.perftests.quarkus.rest.endpoint131.schema.Schema131;

final class Mapper {
    private Mapper() {}

    public static Schema131 of(Model131 model) {
        return new Schema131(model.id(), model.value());
    }
}
