package fr.spacefox.perftests.quarkus.rest.endpoint832;

import fr.spacefox.perftests.quarkus.core.service832.model.Model832;
import fr.spacefox.perftests.quarkus.rest.endpoint832.schema.Schema832;

final class Mapper {
    private Mapper() {}

    public static Schema832 of(Model832 model) {
        return new Schema832(model.id(), model.value());
    }
}
