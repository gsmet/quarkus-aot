package fr.spacefox.perftests.quarkus.rest.endpoint433;

import fr.spacefox.perftests.quarkus.core.service433.model.Model433;
import fr.spacefox.perftests.quarkus.rest.endpoint433.schema.Schema433;

final class Mapper {
    private Mapper() {}

    public static Schema433 of(Model433 model) {
        return new Schema433(model.id(), model.value());
    }
}
