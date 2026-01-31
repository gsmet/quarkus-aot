package fr.spacefox.perftests.quarkus.rest.endpoint702;

import fr.spacefox.perftests.quarkus.core.service702.model.Model702;
import fr.spacefox.perftests.quarkus.rest.endpoint702.schema.Schema702;

final class Mapper {
    private Mapper() {}

    public static Schema702 of(Model702 model) {
        return new Schema702(model.id(), model.value());
    }
}
