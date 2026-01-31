package fr.spacefox.perftests.quarkus.rest.endpoint490;

import fr.spacefox.perftests.quarkus.core.service490.model.Model490;
import fr.spacefox.perftests.quarkus.rest.endpoint490.schema.Schema490;

final class Mapper {
    private Mapper() {}

    public static Schema490 of(Model490 model) {
        return new Schema490(model.id(), model.value());
    }
}
