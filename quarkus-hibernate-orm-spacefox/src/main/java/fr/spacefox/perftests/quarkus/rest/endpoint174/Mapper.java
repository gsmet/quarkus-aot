package fr.spacefox.perftests.quarkus.rest.endpoint174;

import fr.spacefox.perftests.quarkus.core.service174.model.Model174;
import fr.spacefox.perftests.quarkus.rest.endpoint174.schema.Schema174;

final class Mapper {
    private Mapper() {}

    public static Schema174 of(Model174 model) {
        return new Schema174(model.id(), model.value());
    }
}
