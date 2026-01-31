package fr.spacefox.perftests.quarkus.rest.endpoint756;

import fr.spacefox.perftests.quarkus.core.service756.model.Model756;
import fr.spacefox.perftests.quarkus.rest.endpoint756.schema.Schema756;

final class Mapper {
    private Mapper() {}

    public static Schema756 of(Model756 model) {
        return new Schema756(model.id(), model.value());
    }
}
