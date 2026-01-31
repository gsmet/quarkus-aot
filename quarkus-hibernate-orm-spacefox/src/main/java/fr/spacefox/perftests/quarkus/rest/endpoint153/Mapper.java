package fr.spacefox.perftests.quarkus.rest.endpoint153;

import fr.spacefox.perftests.quarkus.core.service153.model.Model153;
import fr.spacefox.perftests.quarkus.rest.endpoint153.schema.Schema153;

final class Mapper {
    private Mapper() {}

    public static Schema153 of(Model153 model) {
        return new Schema153(model.id(), model.value());
    }
}
