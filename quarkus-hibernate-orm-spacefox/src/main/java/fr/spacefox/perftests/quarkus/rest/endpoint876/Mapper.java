package fr.spacefox.perftests.quarkus.rest.endpoint876;

import fr.spacefox.perftests.quarkus.core.service876.model.Model876;
import fr.spacefox.perftests.quarkus.rest.endpoint876.schema.Schema876;

final class Mapper {
    private Mapper() {}

    public static Schema876 of(Model876 model) {
        return new Schema876(model.id(), model.value());
    }
}
