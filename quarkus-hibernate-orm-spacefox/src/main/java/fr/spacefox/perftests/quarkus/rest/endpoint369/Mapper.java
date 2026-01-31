package fr.spacefox.perftests.quarkus.rest.endpoint369;

import fr.spacefox.perftests.quarkus.core.service369.model.Model369;
import fr.spacefox.perftests.quarkus.rest.endpoint369.schema.Schema369;

final class Mapper {
    private Mapper() {}

    public static Schema369 of(Model369 model) {
        return new Schema369(model.id(), model.value());
    }
}
