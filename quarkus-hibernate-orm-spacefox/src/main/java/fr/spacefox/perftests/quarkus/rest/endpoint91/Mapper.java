package fr.spacefox.perftests.quarkus.rest.endpoint91;

import fr.spacefox.perftests.quarkus.core.service91.model.Model91;
import fr.spacefox.perftests.quarkus.rest.endpoint91.schema.Schema91;

final class Mapper {
    private Mapper() {}

    public static Schema91 of(Model91 model) {
        return new Schema91(model.id(), model.value());
    }
}
