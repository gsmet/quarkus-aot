package fr.spacefox.perftests.quarkus.rest.endpoint168;

import fr.spacefox.perftests.quarkus.core.service168.model.Model168;
import fr.spacefox.perftests.quarkus.rest.endpoint168.schema.Schema168;

final class Mapper {
    private Mapper() {}

    public static Schema168 of(Model168 model) {
        return new Schema168(model.id(), model.value());
    }
}
