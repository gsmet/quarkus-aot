package fr.spacefox.perftests.quarkus.rest.endpoint682;

import fr.spacefox.perftests.quarkus.core.service682.model.Model682;
import fr.spacefox.perftests.quarkus.rest.endpoint682.schema.Schema682;

final class Mapper {
    private Mapper() {}

    public static Schema682 of(Model682 model) {
        return new Schema682(model.id(), model.value());
    }
}
