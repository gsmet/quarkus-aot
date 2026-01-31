package fr.spacefox.perftests.quarkus.rest.endpoint28;

import fr.spacefox.perftests.quarkus.core.service28.model.Model28;
import fr.spacefox.perftests.quarkus.rest.endpoint28.schema.Schema28;

final class Mapper {
    private Mapper() {}

    public static Schema28 of(Model28 model) {
        return new Schema28(model.id(), model.value());
    }
}
