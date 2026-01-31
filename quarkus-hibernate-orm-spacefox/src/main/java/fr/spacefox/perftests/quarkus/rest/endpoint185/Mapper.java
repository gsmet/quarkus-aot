package fr.spacefox.perftests.quarkus.rest.endpoint185;

import fr.spacefox.perftests.quarkus.core.service185.model.Model185;
import fr.spacefox.perftests.quarkus.rest.endpoint185.schema.Schema185;

final class Mapper {
    private Mapper() {}

    public static Schema185 of(Model185 model) {
        return new Schema185(model.id(), model.value());
    }
}
