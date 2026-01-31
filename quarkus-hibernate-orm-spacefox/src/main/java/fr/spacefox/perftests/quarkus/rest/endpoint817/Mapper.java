package fr.spacefox.perftests.quarkus.rest.endpoint817;

import fr.spacefox.perftests.quarkus.core.service817.model.Model817;
import fr.spacefox.perftests.quarkus.rest.endpoint817.schema.Schema817;

final class Mapper {
    private Mapper() {}

    public static Schema817 of(Model817 model) {
        return new Schema817(model.id(), model.value());
    }
}
