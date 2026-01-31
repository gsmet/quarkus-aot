package fr.spacefox.perftests.quarkus.rest.endpoint61;

import fr.spacefox.perftests.quarkus.core.service61.model.Model61;
import fr.spacefox.perftests.quarkus.rest.endpoint61.schema.Schema61;

final class Mapper {
    private Mapper() {}

    public static Schema61 of(Model61 model) {
        return new Schema61(model.id(), model.value());
    }
}
