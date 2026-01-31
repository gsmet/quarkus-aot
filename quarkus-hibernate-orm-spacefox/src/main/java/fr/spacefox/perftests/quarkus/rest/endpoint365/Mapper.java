package fr.spacefox.perftests.quarkus.rest.endpoint365;

import fr.spacefox.perftests.quarkus.core.service365.model.Model365;
import fr.spacefox.perftests.quarkus.rest.endpoint365.schema.Schema365;

final class Mapper {
    private Mapper() {}

    public static Schema365 of(Model365 model) {
        return new Schema365(model.id(), model.value());
    }
}
