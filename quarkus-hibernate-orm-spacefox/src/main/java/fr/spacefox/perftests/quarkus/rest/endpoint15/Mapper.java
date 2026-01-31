package fr.spacefox.perftests.quarkus.rest.endpoint15;

import fr.spacefox.perftests.quarkus.core.service15.model.Model15;
import fr.spacefox.perftests.quarkus.rest.endpoint15.schema.Schema15;

final class Mapper {
    private Mapper() {}

    public static Schema15 of(Model15 model) {
        return new Schema15(model.id(), model.value());
    }
}
