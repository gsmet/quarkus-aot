package fr.spacefox.perftests.quarkus.rest.endpoint585;

import fr.spacefox.perftests.quarkus.core.service585.model.Model585;
import fr.spacefox.perftests.quarkus.rest.endpoint585.schema.Schema585;

final class Mapper {
    private Mapper() {}

    public static Schema585 of(Model585 model) {
        return new Schema585(model.id(), model.value());
    }
}
