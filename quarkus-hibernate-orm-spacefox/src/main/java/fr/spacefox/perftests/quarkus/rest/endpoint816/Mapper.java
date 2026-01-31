package fr.spacefox.perftests.quarkus.rest.endpoint816;

import fr.spacefox.perftests.quarkus.core.service816.model.Model816;
import fr.spacefox.perftests.quarkus.rest.endpoint816.schema.Schema816;

final class Mapper {
    private Mapper() {}

    public static Schema816 of(Model816 model) {
        return new Schema816(model.id(), model.value());
    }
}
