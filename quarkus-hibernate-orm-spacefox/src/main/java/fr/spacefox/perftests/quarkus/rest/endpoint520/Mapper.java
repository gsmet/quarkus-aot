package fr.spacefox.perftests.quarkus.rest.endpoint520;

import fr.spacefox.perftests.quarkus.core.service520.model.Model520;
import fr.spacefox.perftests.quarkus.rest.endpoint520.schema.Schema520;

final class Mapper {
    private Mapper() {}

    public static Schema520 of(Model520 model) {
        return new Schema520(model.id(), model.value());
    }
}
