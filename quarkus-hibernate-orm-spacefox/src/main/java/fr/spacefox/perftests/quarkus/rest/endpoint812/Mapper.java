package fr.spacefox.perftests.quarkus.rest.endpoint812;

import fr.spacefox.perftests.quarkus.core.service812.model.Model812;
import fr.spacefox.perftests.quarkus.rest.endpoint812.schema.Schema812;

final class Mapper {
    private Mapper() {}

    public static Schema812 of(Model812 model) {
        return new Schema812(model.id(), model.value());
    }
}
