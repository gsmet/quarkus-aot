package fr.spacefox.perftests.quarkus.rest.endpoint708;

import fr.spacefox.perftests.quarkus.core.service708.model.Model708;
import fr.spacefox.perftests.quarkus.rest.endpoint708.schema.Schema708;

final class Mapper {
    private Mapper() {}

    public static Schema708 of(Model708 model) {
        return new Schema708(model.id(), model.value());
    }
}
