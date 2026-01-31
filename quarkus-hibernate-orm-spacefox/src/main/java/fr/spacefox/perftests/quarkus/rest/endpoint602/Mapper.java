package fr.spacefox.perftests.quarkus.rest.endpoint602;

import fr.spacefox.perftests.quarkus.core.service602.model.Model602;
import fr.spacefox.perftests.quarkus.rest.endpoint602.schema.Schema602;

final class Mapper {
    private Mapper() {}

    public static Schema602 of(Model602 model) {
        return new Schema602(model.id(), model.value());
    }
}
