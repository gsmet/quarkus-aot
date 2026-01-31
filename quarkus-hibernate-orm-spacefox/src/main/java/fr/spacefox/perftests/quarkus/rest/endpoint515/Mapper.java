package fr.spacefox.perftests.quarkus.rest.endpoint515;

import fr.spacefox.perftests.quarkus.core.service515.model.Model515;
import fr.spacefox.perftests.quarkus.rest.endpoint515.schema.Schema515;

final class Mapper {
    private Mapper() {}

    public static Schema515 of(Model515 model) {
        return new Schema515(model.id(), model.value());
    }
}
