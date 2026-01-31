package fr.spacefox.perftests.quarkus.rest.endpoint46;

import fr.spacefox.perftests.quarkus.core.service46.model.Model46;
import fr.spacefox.perftests.quarkus.rest.endpoint46.schema.Schema46;

final class Mapper {
    private Mapper() {}

    public static Schema46 of(Model46 model) {
        return new Schema46(model.id(), model.value());
    }
}
