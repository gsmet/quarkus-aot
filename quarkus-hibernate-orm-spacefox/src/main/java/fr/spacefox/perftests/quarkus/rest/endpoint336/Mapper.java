package fr.spacefox.perftests.quarkus.rest.endpoint336;

import fr.spacefox.perftests.quarkus.core.service336.model.Model336;
import fr.spacefox.perftests.quarkus.rest.endpoint336.schema.Schema336;

final class Mapper {
    private Mapper() {}

    public static Schema336 of(Model336 model) {
        return new Schema336(model.id(), model.value());
    }
}
