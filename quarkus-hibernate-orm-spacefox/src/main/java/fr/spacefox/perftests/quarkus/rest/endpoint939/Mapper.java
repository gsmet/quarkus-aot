package fr.spacefox.perftests.quarkus.rest.endpoint939;

import fr.spacefox.perftests.quarkus.core.service939.model.Model939;
import fr.spacefox.perftests.quarkus.rest.endpoint939.schema.Schema939;

final class Mapper {
    private Mapper() {}

    public static Schema939 of(Model939 model) {
        return new Schema939(model.id(), model.value());
    }
}
