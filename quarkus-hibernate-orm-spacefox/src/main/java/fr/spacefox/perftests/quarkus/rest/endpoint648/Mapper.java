package fr.spacefox.perftests.quarkus.rest.endpoint648;

import fr.spacefox.perftests.quarkus.core.service648.model.Model648;
import fr.spacefox.perftests.quarkus.rest.endpoint648.schema.Schema648;

final class Mapper {
    private Mapper() {}

    public static Schema648 of(Model648 model) {
        return new Schema648(model.id(), model.value());
    }
}
