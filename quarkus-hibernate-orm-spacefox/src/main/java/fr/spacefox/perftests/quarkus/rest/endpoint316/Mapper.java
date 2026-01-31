package fr.spacefox.perftests.quarkus.rest.endpoint316;

import fr.spacefox.perftests.quarkus.core.service316.model.Model316;
import fr.spacefox.perftests.quarkus.rest.endpoint316.schema.Schema316;

final class Mapper {
    private Mapper() {}

    public static Schema316 of(Model316 model) {
        return new Schema316(model.id(), model.value());
    }
}
