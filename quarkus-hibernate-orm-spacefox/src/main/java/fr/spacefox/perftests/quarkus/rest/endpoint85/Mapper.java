package fr.spacefox.perftests.quarkus.rest.endpoint85;

import fr.spacefox.perftests.quarkus.core.service85.model.Model85;
import fr.spacefox.perftests.quarkus.rest.endpoint85.schema.Schema85;

final class Mapper {
    private Mapper() {}

    public static Schema85 of(Model85 model) {
        return new Schema85(model.id(), model.value());
    }
}
