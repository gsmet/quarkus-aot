package fr.spacefox.perftests.quarkus.rest.endpoint439;

import fr.spacefox.perftests.quarkus.core.service439.model.Model439;
import fr.spacefox.perftests.quarkus.rest.endpoint439.schema.Schema439;

final class Mapper {
    private Mapper() {}

    public static Schema439 of(Model439 model) {
        return new Schema439(model.id(), model.value());
    }
}
