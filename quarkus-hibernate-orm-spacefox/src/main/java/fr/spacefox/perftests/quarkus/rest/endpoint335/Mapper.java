package fr.spacefox.perftests.quarkus.rest.endpoint335;

import fr.spacefox.perftests.quarkus.core.service335.model.Model335;
import fr.spacefox.perftests.quarkus.rest.endpoint335.schema.Schema335;

final class Mapper {
    private Mapper() {}

    public static Schema335 of(Model335 model) {
        return new Schema335(model.id(), model.value());
    }
}
