package fr.spacefox.perftests.quarkus.rest.endpoint615;

import fr.spacefox.perftests.quarkus.core.service615.model.Model615;
import fr.spacefox.perftests.quarkus.rest.endpoint615.schema.Schema615;

final class Mapper {
    private Mapper() {}

    public static Schema615 of(Model615 model) {
        return new Schema615(model.id(), model.value());
    }
}
