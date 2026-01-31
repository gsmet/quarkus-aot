package fr.spacefox.perftests.quarkus.rest.endpoint9;

import fr.spacefox.perftests.quarkus.core.service9.model.Model9;
import fr.spacefox.perftests.quarkus.rest.endpoint9.schema.Schema9;

final class Mapper {
    private Mapper() {}

    public static Schema9 of(Model9 model) {
        return new Schema9(model.id(), model.value());
    }
}
