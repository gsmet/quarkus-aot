package fr.spacefox.perftests.quarkus.rest.endpoint180;

import fr.spacefox.perftests.quarkus.core.service180.model.Model180;
import fr.spacefox.perftests.quarkus.rest.endpoint180.schema.Schema180;

final class Mapper {
    private Mapper() {}

    public static Schema180 of(Model180 model) {
        return new Schema180(model.id(), model.value());
    }
}
