package fr.spacefox.perftests.quarkus.rest.endpoint541;

import fr.spacefox.perftests.quarkus.core.service541.model.Model541;
import fr.spacefox.perftests.quarkus.rest.endpoint541.schema.Schema541;

final class Mapper {
    private Mapper() {}

    public static Schema541 of(Model541 model) {
        return new Schema541(model.id(), model.value());
    }
}
