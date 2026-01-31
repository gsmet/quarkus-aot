package fr.spacefox.perftests.quarkus.rest.endpoint186;

import fr.spacefox.perftests.quarkus.core.service186.model.Model186;
import fr.spacefox.perftests.quarkus.rest.endpoint186.schema.Schema186;

final class Mapper {
    private Mapper() {}

    public static Schema186 of(Model186 model) {
        return new Schema186(model.id(), model.value());
    }
}
