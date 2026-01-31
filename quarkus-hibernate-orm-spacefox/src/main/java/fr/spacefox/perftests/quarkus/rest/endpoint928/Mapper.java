package fr.spacefox.perftests.quarkus.rest.endpoint928;

import fr.spacefox.perftests.quarkus.core.service928.model.Model928;
import fr.spacefox.perftests.quarkus.rest.endpoint928.schema.Schema928;

final class Mapper {
    private Mapper() {}

    public static Schema928 of(Model928 model) {
        return new Schema928(model.id(), model.value());
    }
}
