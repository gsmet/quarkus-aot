package fr.spacefox.perftests.quarkus.rest.endpoint14;

import fr.spacefox.perftests.quarkus.core.service14.model.Model14;
import fr.spacefox.perftests.quarkus.rest.endpoint14.schema.Schema14;

final class Mapper {
    private Mapper() {}

    public static Schema14 of(Model14 model) {
        return new Schema14(model.id(), model.value());
    }
}
