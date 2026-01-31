package fr.spacefox.perftests.quarkus.rest.endpoint641;

import fr.spacefox.perftests.quarkus.core.service641.model.Model641;
import fr.spacefox.perftests.quarkus.rest.endpoint641.schema.Schema641;

final class Mapper {
    private Mapper() {}

    public static Schema641 of(Model641 model) {
        return new Schema641(model.id(), model.value());
    }
}
