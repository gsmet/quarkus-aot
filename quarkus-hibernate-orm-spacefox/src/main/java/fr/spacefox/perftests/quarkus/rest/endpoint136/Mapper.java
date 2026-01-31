package fr.spacefox.perftests.quarkus.rest.endpoint136;

import fr.spacefox.perftests.quarkus.core.service136.model.Model136;
import fr.spacefox.perftests.quarkus.rest.endpoint136.schema.Schema136;

final class Mapper {
    private Mapper() {}

    public static Schema136 of(Model136 model) {
        return new Schema136(model.id(), model.value());
    }
}
