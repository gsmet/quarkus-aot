package fr.spacefox.perftests.quarkus.rest.endpoint397;

import fr.spacefox.perftests.quarkus.core.service397.model.Model397;
import fr.spacefox.perftests.quarkus.rest.endpoint397.schema.Schema397;

final class Mapper {
    private Mapper() {}

    public static Schema397 of(Model397 model) {
        return new Schema397(model.id(), model.value());
    }
}
