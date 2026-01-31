package fr.spacefox.perftests.quarkus.rest.endpoint241;

import fr.spacefox.perftests.quarkus.core.service241.model.Model241;
import fr.spacefox.perftests.quarkus.rest.endpoint241.schema.Schema241;

final class Mapper {
    private Mapper() {}

    public static Schema241 of(Model241 model) {
        return new Schema241(model.id(), model.value());
    }
}
