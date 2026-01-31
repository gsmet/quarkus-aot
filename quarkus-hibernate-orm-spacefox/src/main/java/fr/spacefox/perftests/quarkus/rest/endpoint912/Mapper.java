package fr.spacefox.perftests.quarkus.rest.endpoint912;

import fr.spacefox.perftests.quarkus.core.service912.model.Model912;
import fr.spacefox.perftests.quarkus.rest.endpoint912.schema.Schema912;

final class Mapper {
    private Mapper() {}

    public static Schema912 of(Model912 model) {
        return new Schema912(model.id(), model.value());
    }
}
