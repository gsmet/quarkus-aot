package fr.spacefox.perftests.quarkus.rest.endpoint649;

import fr.spacefox.perftests.quarkus.core.service649.model.Model649;
import fr.spacefox.perftests.quarkus.rest.endpoint649.schema.Schema649;

final class Mapper {
    private Mapper() {}

    public static Schema649 of(Model649 model) {
        return new Schema649(model.id(), model.value());
    }
}
