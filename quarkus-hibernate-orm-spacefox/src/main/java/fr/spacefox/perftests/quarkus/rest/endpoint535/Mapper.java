package fr.spacefox.perftests.quarkus.rest.endpoint535;

import fr.spacefox.perftests.quarkus.core.service535.model.Model535;
import fr.spacefox.perftests.quarkus.rest.endpoint535.schema.Schema535;

final class Mapper {
    private Mapper() {}

    public static Schema535 of(Model535 model) {
        return new Schema535(model.id(), model.value());
    }
}
