package fr.spacefox.perftests.quarkus.rest.endpoint785;

import fr.spacefox.perftests.quarkus.core.service785.model.Model785;
import fr.spacefox.perftests.quarkus.rest.endpoint785.schema.Schema785;

final class Mapper {
    private Mapper() {}

    public static Schema785 of(Model785 model) {
        return new Schema785(model.id(), model.value());
    }
}
