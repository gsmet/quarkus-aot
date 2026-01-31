package fr.spacefox.perftests.quarkus.rest.endpoint652;

import fr.spacefox.perftests.quarkus.core.service652.model.Model652;
import fr.spacefox.perftests.quarkus.rest.endpoint652.schema.Schema652;

final class Mapper {
    private Mapper() {}

    public static Schema652 of(Model652 model) {
        return new Schema652(model.id(), model.value());
    }
}
