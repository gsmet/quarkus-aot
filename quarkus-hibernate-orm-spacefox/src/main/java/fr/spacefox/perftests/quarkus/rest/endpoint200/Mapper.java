package fr.spacefox.perftests.quarkus.rest.endpoint200;

import fr.spacefox.perftests.quarkus.core.service200.model.Model200;
import fr.spacefox.perftests.quarkus.rest.endpoint200.schema.Schema200;

final class Mapper {
    private Mapper() {}

    public static Schema200 of(Model200 model) {
        return new Schema200(model.id(), model.value());
    }
}
