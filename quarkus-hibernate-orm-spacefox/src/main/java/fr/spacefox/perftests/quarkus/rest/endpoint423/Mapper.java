package fr.spacefox.perftests.quarkus.rest.endpoint423;

import fr.spacefox.perftests.quarkus.core.service423.model.Model423;
import fr.spacefox.perftests.quarkus.rest.endpoint423.schema.Schema423;

final class Mapper {
    private Mapper() {}

    public static Schema423 of(Model423 model) {
        return new Schema423(model.id(), model.value());
    }
}
