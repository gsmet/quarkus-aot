package fr.spacefox.perftests.quarkus.rest.endpoint929;

import fr.spacefox.perftests.quarkus.core.service929.model.Model929;
import fr.spacefox.perftests.quarkus.rest.endpoint929.schema.Schema929;

final class Mapper {
    private Mapper() {}

    public static Schema929 of(Model929 model) {
        return new Schema929(model.id(), model.value());
    }
}
