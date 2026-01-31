package fr.spacefox.perftests.quarkus.rest.endpoint108;

import fr.spacefox.perftests.quarkus.core.service108.model.Model108;
import fr.spacefox.perftests.quarkus.rest.endpoint108.schema.Schema108;

final class Mapper {
    private Mapper() {}

    public static Schema108 of(Model108 model) {
        return new Schema108(model.id(), model.value());
    }
}
