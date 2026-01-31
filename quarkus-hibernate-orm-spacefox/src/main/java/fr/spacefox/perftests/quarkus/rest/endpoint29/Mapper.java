package fr.spacefox.perftests.quarkus.rest.endpoint29;

import fr.spacefox.perftests.quarkus.core.service29.model.Model29;
import fr.spacefox.perftests.quarkus.rest.endpoint29.schema.Schema29;

final class Mapper {
    private Mapper() {}

    public static Schema29 of(Model29 model) {
        return new Schema29(model.id(), model.value());
    }
}
