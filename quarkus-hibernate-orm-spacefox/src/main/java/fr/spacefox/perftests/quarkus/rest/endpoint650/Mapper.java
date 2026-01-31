package fr.spacefox.perftests.quarkus.rest.endpoint650;

import fr.spacefox.perftests.quarkus.core.service650.model.Model650;
import fr.spacefox.perftests.quarkus.rest.endpoint650.schema.Schema650;

final class Mapper {
    private Mapper() {}

    public static Schema650 of(Model650 model) {
        return new Schema650(model.id(), model.value());
    }
}
