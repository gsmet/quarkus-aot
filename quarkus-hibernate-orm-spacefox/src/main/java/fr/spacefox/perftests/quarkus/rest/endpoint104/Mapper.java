package fr.spacefox.perftests.quarkus.rest.endpoint104;

import fr.spacefox.perftests.quarkus.core.service104.model.Model104;
import fr.spacefox.perftests.quarkus.rest.endpoint104.schema.Schema104;

final class Mapper {
    private Mapper() {}

    public static Schema104 of(Model104 model) {
        return new Schema104(model.id(), model.value());
    }
}
