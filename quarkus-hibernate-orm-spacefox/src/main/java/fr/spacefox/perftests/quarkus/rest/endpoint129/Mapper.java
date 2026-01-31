package fr.spacefox.perftests.quarkus.rest.endpoint129;

import fr.spacefox.perftests.quarkus.core.service129.model.Model129;
import fr.spacefox.perftests.quarkus.rest.endpoint129.schema.Schema129;

final class Mapper {
    private Mapper() {}

    public static Schema129 of(Model129 model) {
        return new Schema129(model.id(), model.value());
    }
}
