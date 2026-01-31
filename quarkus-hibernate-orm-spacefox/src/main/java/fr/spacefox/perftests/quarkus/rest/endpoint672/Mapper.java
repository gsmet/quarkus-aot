package fr.spacefox.perftests.quarkus.rest.endpoint672;

import fr.spacefox.perftests.quarkus.core.service672.model.Model672;
import fr.spacefox.perftests.quarkus.rest.endpoint672.schema.Schema672;

final class Mapper {
    private Mapper() {}

    public static Schema672 of(Model672 model) {
        return new Schema672(model.id(), model.value());
    }
}
