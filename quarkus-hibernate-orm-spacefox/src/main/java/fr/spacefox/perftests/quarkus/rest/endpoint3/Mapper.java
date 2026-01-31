package fr.spacefox.perftests.quarkus.rest.endpoint3;

import fr.spacefox.perftests.quarkus.core.service3.model.Model3;
import fr.spacefox.perftests.quarkus.rest.endpoint3.schema.Schema3;

final class Mapper {
    private Mapper() {}

    public static Schema3 of(Model3 model) {
        return new Schema3(model.id(), model.value());
    }
}
