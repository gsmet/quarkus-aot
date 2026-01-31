package fr.spacefox.perftests.quarkus.rest.endpoint854;

import fr.spacefox.perftests.quarkus.core.service854.model.Model854;
import fr.spacefox.perftests.quarkus.rest.endpoint854.schema.Schema854;

final class Mapper {
    private Mapper() {}

    public static Schema854 of(Model854 model) {
        return new Schema854(model.id(), model.value());
    }
}
