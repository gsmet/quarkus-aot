package fr.spacefox.perftests.quarkus.rest.endpoint634;

import fr.spacefox.perftests.quarkus.core.service634.model.Model634;
import fr.spacefox.perftests.quarkus.rest.endpoint634.schema.Schema634;

final class Mapper {
    private Mapper() {}

    public static Schema634 of(Model634 model) {
        return new Schema634(model.id(), model.value());
    }
}
