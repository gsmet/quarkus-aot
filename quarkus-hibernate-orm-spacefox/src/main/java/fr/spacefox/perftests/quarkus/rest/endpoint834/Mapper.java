package fr.spacefox.perftests.quarkus.rest.endpoint834;

import fr.spacefox.perftests.quarkus.core.service834.model.Model834;
import fr.spacefox.perftests.quarkus.rest.endpoint834.schema.Schema834;

final class Mapper {
    private Mapper() {}

    public static Schema834 of(Model834 model) {
        return new Schema834(model.id(), model.value());
    }
}
