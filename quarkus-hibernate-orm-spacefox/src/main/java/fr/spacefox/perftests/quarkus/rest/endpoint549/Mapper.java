package fr.spacefox.perftests.quarkus.rest.endpoint549;

import fr.spacefox.perftests.quarkus.core.service549.model.Model549;
import fr.spacefox.perftests.quarkus.rest.endpoint549.schema.Schema549;

final class Mapper {
    private Mapper() {}

    public static Schema549 of(Model549 model) {
        return new Schema549(model.id(), model.value());
    }
}
