package fr.spacefox.perftests.quarkus.rest.endpoint527;

import fr.spacefox.perftests.quarkus.core.service527.model.Model527;
import fr.spacefox.perftests.quarkus.rest.endpoint527.schema.Schema527;

final class Mapper {
    private Mapper() {}

    public static Schema527 of(Model527 model) {
        return new Schema527(model.id(), model.value());
    }
}
