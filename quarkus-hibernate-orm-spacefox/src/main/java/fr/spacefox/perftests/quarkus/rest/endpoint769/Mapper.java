package fr.spacefox.perftests.quarkus.rest.endpoint769;

import fr.spacefox.perftests.quarkus.core.service769.model.Model769;
import fr.spacefox.perftests.quarkus.rest.endpoint769.schema.Schema769;

final class Mapper {
    private Mapper() {}

    public static Schema769 of(Model769 model) {
        return new Schema769(model.id(), model.value());
    }
}
