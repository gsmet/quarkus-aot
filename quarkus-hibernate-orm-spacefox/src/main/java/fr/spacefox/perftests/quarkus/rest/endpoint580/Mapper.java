package fr.spacefox.perftests.quarkus.rest.endpoint580;

import fr.spacefox.perftests.quarkus.core.service580.model.Model580;
import fr.spacefox.perftests.quarkus.rest.endpoint580.schema.Schema580;

final class Mapper {
    private Mapper() {}

    public static Schema580 of(Model580 model) {
        return new Schema580(model.id(), model.value());
    }
}
