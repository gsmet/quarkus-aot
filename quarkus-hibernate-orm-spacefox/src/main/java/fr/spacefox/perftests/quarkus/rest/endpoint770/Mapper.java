package fr.spacefox.perftests.quarkus.rest.endpoint770;

import fr.spacefox.perftests.quarkus.core.service770.model.Model770;
import fr.spacefox.perftests.quarkus.rest.endpoint770.schema.Schema770;

final class Mapper {
    private Mapper() {}

    public static Schema770 of(Model770 model) {
        return new Schema770(model.id(), model.value());
    }
}
