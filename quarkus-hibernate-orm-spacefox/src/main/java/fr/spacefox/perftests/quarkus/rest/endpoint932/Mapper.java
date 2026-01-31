package fr.spacefox.perftests.quarkus.rest.endpoint932;

import fr.spacefox.perftests.quarkus.core.service932.model.Model932;
import fr.spacefox.perftests.quarkus.rest.endpoint932.schema.Schema932;

final class Mapper {
    private Mapper() {}

    public static Schema932 of(Model932 model) {
        return new Schema932(model.id(), model.value());
    }
}
