package fr.spacefox.perftests.quarkus.rest.endpoint685;

import fr.spacefox.perftests.quarkus.core.service685.model.Model685;
import fr.spacefox.perftests.quarkus.rest.endpoint685.schema.Schema685;

final class Mapper {
    private Mapper() {}

    public static Schema685 of(Model685 model) {
        return new Schema685(model.id(), model.value());
    }
}
