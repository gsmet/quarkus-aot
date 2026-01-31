package fr.spacefox.perftests.quarkus.rest.endpoint938;

import fr.spacefox.perftests.quarkus.core.service938.model.Model938;
import fr.spacefox.perftests.quarkus.rest.endpoint938.schema.Schema938;

final class Mapper {
    private Mapper() {}

    public static Schema938 of(Model938 model) {
        return new Schema938(model.id(), model.value());
    }
}
