package fr.spacefox.perftests.quarkus.rest.endpoint43;

import fr.spacefox.perftests.quarkus.core.service43.model.Model43;
import fr.spacefox.perftests.quarkus.rest.endpoint43.schema.Schema43;

final class Mapper {
    private Mapper() {}

    public static Schema43 of(Model43 model) {
        return new Schema43(model.id(), model.value());
    }
}
